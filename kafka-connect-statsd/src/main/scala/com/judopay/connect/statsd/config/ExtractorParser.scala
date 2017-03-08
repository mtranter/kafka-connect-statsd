package com.judopay.connect.statsd.config

import com.judopay.connect.statsd.ConnectorParser.{ComparisonContext, LhsContext, RhsContext, StattypeContext}
import com.judopay.connect.statsd.{ConnectorLexer, ConnectorParser, ConnectorParserBaseListener, StatType}
import org.antlr.v4.runtime._
import org.apache.kafka.connect.data.Struct
import org.apache.kafka.connect.sink.SinkRecord

/**
  * Created by mark on 08/03/17.
  */

case class ExtractorConfig(topic: String, metric: SinkRecord => String, statType: StatType, field: Option[SinkRecord => AnyRef], predicate: Option[SinkRecord => Boolean])

object ExtractorConfig {

  def apply(topic: String, metric: SinkRecord => String, statType: StatType): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, None, None)

  def apply(topic: String, metric: SinkRecord => String,
            statType: StatType, field: SinkRecord => AnyRef): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, Some(field), None)

  def apply(
             topic: String, metric: SinkRecord => String,
             statType: StatType, field: SinkRecord => AnyRef,
             predicate: SinkRecord => Boolean): ExtractorConfig =
    new ExtractorConfig(topic, metric, statType, Some(field), Some(predicate))

  def parse(syntax: String): ExtractorConfig=  {
    val lexer = new ConnectorLexer(new ANTLRInputStream(syntax))
    val tokens = new CommonTokenStream(lexer)
    val parser = new ConnectorParser(tokens)
    var config = ExtractorConfig("", sr => "", StatType.Count)
    var rhsCast: String => Object = identity

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
          config = config.copy(metric = sr => metric.replace("${" + metricField + "}",sr.value().asInstanceOf[Struct].get(metricField).toString))
        }else {
          config = config.copy(metric = sr => metric)
        }
      }

      override def exitSend_field(ctx: ConnectorParser.Send_fieldContext) = {
        if(ctx.getText != "*"){
          config = config.copy(field = Some(sr => sr.value().asInstanceOf[Struct].get(ctx.getText)))
        }
      }

      override def exitComparison(ctx: ComparisonContext): Unit = {
        val lhs = ctx.lhs().getText
        val rhs = ctx.rhs().getText
        config = config.copy(predicate = Some(sr => sr.value().asInstanceOf[Struct].get(lhs) == rhsCast(rhs)))
      }

      override def exitRhs(ctx: RhsContext): Unit = {
        if(ctx.DECIMAL() != null) rhsCast = o => o.toDouble.asInstanceOf[Object]
        if(ctx.INT() != null) rhsCast = o => o.toInt.asInstanceOf[Object]
        if(ctx.STRING() != null) rhsCast = o => o.replaceAll("'","").asInstanceOf[Object]
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
