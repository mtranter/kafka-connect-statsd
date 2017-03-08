// Generated from /home/mark/projects/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorParser.g4 by ANTLR 4.6
package com.judopay.connect.statsd;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConnectorParser}.
 */
public interface ConnectorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ConnectorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ConnectorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#send_basic}.
	 * @param ctx the parse tree
	 */
	void enterSend_basic(ConnectorParser.Send_basicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#send_basic}.
	 * @param ctx the parse tree
	 */
	void exitSend_basic(ConnectorParser.Send_basicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ConnectorParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ConnectorParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#stattype}.
	 * @param ctx the parse tree
	 */
	void enterStattype(ConnectorParser.StattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#stattype}.
	 * @param ctx the parse tree
	 */
	void exitStattype(ConnectorParser.StattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#topicname}.
	 * @param ctx the parse tree
	 */
	void enterTopicname(ConnectorParser.TopicnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#topicname}.
	 * @param ctx the parse tree
	 */
	void exitTopicname(ConnectorParser.TopicnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#metric}.
	 * @param ctx the parse tree
	 */
	void enterMetric(ConnectorParser.MetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#metric}.
	 * @param ctx the parse tree
	 */
	void exitMetric(ConnectorParser.MetricContext ctx);
}