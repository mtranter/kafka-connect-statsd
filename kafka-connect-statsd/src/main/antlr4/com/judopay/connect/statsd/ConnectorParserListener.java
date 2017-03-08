// Generated from /home/marktranter/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorParser.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link ConnectorParser#send_with_where}.
	 * @param ctx the parse tree
	 */
	void enterSend_with_where(ConnectorParser.Send_with_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#send_with_where}.
	 * @param ctx the parse tree
	 */
	void exitSend_with_where(ConnectorParser.Send_with_whereContext ctx);
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
	 * Enter a parse tree produced by {@link ConnectorParser#send_clause}.
	 * @param ctx the parse tree
	 */
	void enterSend_clause(ConnectorParser.Send_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#send_clause}.
	 * @param ctx the parse tree
	 */
	void exitSend_clause(ConnectorParser.Send_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(ConnectorParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(ConnectorParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ConnectorParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ConnectorParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(ConnectorParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(ConnectorParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(ConnectorParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(ConnectorParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(ConnectorParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(ConnectorParser.RhsContext ctx);
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
	 * Enter a parse tree produced by {@link ConnectorParser#send_field}.
	 * @param ctx the parse tree
	 */
	void enterSend_field(ConnectorParser.Send_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#send_field}.
	 * @param ctx the parse tree
	 */
	void exitSend_field(ConnectorParser.Send_fieldContext ctx);
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
	 * Enter a parse tree produced by {@link ConnectorParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ConnectorParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ConnectorParser.TemplateContext ctx);
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
}