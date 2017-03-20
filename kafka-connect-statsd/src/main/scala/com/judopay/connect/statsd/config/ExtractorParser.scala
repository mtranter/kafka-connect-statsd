package com.judopay.connect.statsd.config

import com.judopay.connect.statsd.ConnectorParser.{ComparisonContext, LhsContext, RhsContext, StattypeContext}
import com.judopay.connect.statsd.{ConnectorLexer, ConnectorParser, ConnectorParserBaseListener, StatType}
import org.antlr.v4.runtime._
import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

/**
  * Created by mark on 08/03/17.
  */

abstract class BinaryComparisonOp {
  def apply(a: AnyRef, b: AnyRef): Boolean
}
object EqualsComparisonOp extends BinaryComparisonOp{
  override def apply(a: AnyRef, b: AnyRef): Boolean = a == b
}
abstract class SinkRecordPredicate {
  def apply(sr: SinkRecord): Boolean
}
object TrueSinkRecordPredicate extends SinkRecordPredicate {
  override def apply(sr: SinkRecord): Boolean = true
}
case class StructFieldPredicate(field: Option[String], rhs: AnyRef, op: BinaryComparisonOp) extends SinkRecordPredicate {
  def apply(sr: SinkRecord) = field match {
    case None => sr.value() == rhs
    case Some(f) => {
      val field = f
      sr.value().asInstanceOf[Struct].get(field).equals(rhs)
    }
  }
}


case class ExtractorConfig(topic: String, metric: SinkRecord => String, statType: StatType, field: Option[String], predicate: SinkRecordPredicate = TrueSinkRecordPredicate)

object ExtractorConfig {

  def apply(topic: String, metric: SinkRecord => String, statType: StatType): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, None, TrueSinkRecordPredicate)

  def apply(topic: String, metric: SinkRecord => String,
            statType: StatType, field: String): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, Some(field), TrueSinkRecordPredicate)

  def apply(
             topic: String, metric: SinkRecord => String,
             statType: StatType, field: String,
             predicate: SinkRecordPredicate): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, Some(field), predicate)

  def parse(syntax: String): ExtractorConfig=  {
    val lexer = new ConnectorLexer(new ANTLRInputStream(syntax))
    val tokens = new CommonTokenStream(lexer)
    val parser = new ConnectorParser(tokens)
    var config = ExtractorConfig("", sr => "", StatType.Count)
    var nextRhs: Option[AnyRef] = None

    parser.addErrorListener(new BaseErrorListener {
      override def syntaxError(recognizer: Recognizer[_, _],
                               offendingSymbol: Any,
                               line: Int,
                               charPositionInLine: Int,
                               msg: String,
                               e: RecognitionException): Unit = throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e)
    })

    parser.addParseListener(new ConnectorParserBaseListener {
      override def exitTopicname(ctx: ConnectorParser.TopicnameContext) = {
        config = config.copy(topic = ctx.getText)
      }

      override def exitStattype(ctx: ConnectorParser.StattypeContext): Unit = {
        val statType = ctx.getText.toLowerCase() match {
          case "value()" => StatType.Value
          case "count()" => StatType.Count
          case s:String => throw new Exception(s"Unknown stat type ${s}")
        }
        config = config.copy(statType = statType)
      }

      override def exitMetric(ctx: ConnectorParser.MetricContext) = {
        val metric = ctx.getText
        val metricTempalte = ctx.template()
        if(metricTempalte != null){
          val metricField = metricTempalte.field().getText
          config = config.copy(metric = sr => {
            val value = sr.value().asInstanceOf[Struct].get(metricField)
            val metricToReplaceWith = if(value == null) "null" else value.toString
            metric.replace("${" + metricField + "}", metricToReplaceWith)
          })
        }else {
          config = config.copy(metric = sr => metric)
        }
      }

      override def exitSend_field(ctx: ConnectorParser.Send_fieldContext) = {
        if(ctx.getText != "*"){
          config = config.copy(field = Some(ctx.getText))
        }
      }

      override def exitComparison(ctx: ComparisonContext): Unit = {
        val lhs = ctx.lhs().getText
        config = nextRhs match {
          case Some(s) =>  config.copy(predicate = StructFieldPredicate(Some(lhs),s,EqualsComparisonOp))
          case None => throw new Exception("Unable to parse rhs of comparison expression " + ctx.getText)
        }
        nextRhs = None
      }

      override def exitRhs(ctx: RhsContext): Unit = {
        if(ctx.DECIMAL() != null) nextRhs = Some(ctx.getText.toDouble.asInstanceOf[AnyRef])
        else if(ctx.INT() != null) nextRhs = Some(ctx.getText.toInt.asInstanceOf[AnyRef])
        else if(ctx.STRING() != null) nextRhs = Some(ctx.getText.replaceAll("'","").asInstanceOf[AnyRef])
      }

    })

    try {
      parser.stat()
    } catch  {
      case ex: Throwable =>
      throw new IllegalArgumentException("Invalid syntax." + ex.getMessage(), ex);
    }

    config
  }



}
