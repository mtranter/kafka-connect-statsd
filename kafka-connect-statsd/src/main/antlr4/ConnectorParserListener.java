// Generated from /home/mark/projects/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConnectorParser}.
 */
public interface ConnectorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConnectorParser#send_count_basic}.
	 * @param ctx the parse tree
	 */
	void enterSend_count_basic(ConnectorParser.Send_count_basicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConnectorParser#send_count_basic}.
	 * @param ctx the parse tree
	 */
	void exitSend_count_basic(ConnectorParser.Send_count_basicContext ctx);
}