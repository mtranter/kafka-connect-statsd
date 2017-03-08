package com.judopay.connect.statsd.config

import com.judopay.connect.statsd.{ConnectorLexer, ConnectorParser, ConnectorParserBaseListener, StatType}
import org.antlr.v4.runtime._
import org.apache.kafka.connect.sink.SinkRecord

/**
  * Created by mark on 08/03/17.
  */

case class ExtractorConfig(topic: String, metric: String, statType: StatType, field: Option[String], predicate: Option[SinkRecord => Boolean])

object ExtractorConfig {

  def parse(syntax: String): ExtractorConfig=  {
    val lexer = new ConnectorLexer(new ANTLRInputStream(syntax))
    val tokens = new CommonTokenStream(lexer)
    val parser = new ConnectorParser(tokens)
    var config = ExtractorConfig("", "", StatType.Count, None, None)

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

      override def exitMetric(ctx: ConnectorParser.MetricContext) = {
        config = config.copy(metric = ctx.getText)
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
