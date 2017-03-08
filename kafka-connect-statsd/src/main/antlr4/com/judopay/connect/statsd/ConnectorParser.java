// Generated from /home/marktranter/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorParser.g4 by ANTLR 4.6
package com.judopay.connect.statsd;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEND=1, COUNT=2, VALUE=3, OF=4, TO=5, FROM=6, WHERE=7, STRING=8, INT=9, 
		DECIMAL=10, EQUALS=11, START_TEMPLATE=12, END_TEMPLATE=13, WORD=14, ID=15, 
		METRIC=16, TOPICNAME=17, ASTERISK=18, WS=19;
	public static final int
		RULE_stat = 0, RULE_send_with_where = 1, RULE_send_basic = 2, RULE_send_clause = 3, 
		RULE_where_clause = 4, RULE_comparison = 5, RULE_comp_op = 6, RULE_lhs = 7, 
		RULE_rhs = 8, RULE_field = 9, RULE_send_field = 10, RULE_stattype = 11, 
		RULE_template = 12, RULE_metric = 13, RULE_topicname = 14;
	public static final String[] ruleNames = {
		"stat", "send_with_where", "send_basic", "send_clause", "where_clause", 
		"comparison", "comp_op", "lhs", "rhs", "field", "send_field", "stattype", 
		"template", "metric", "topicname"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'${'", "'}'", null, null, null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "STRING", 
		"INT", "DECIMAL", "EQUALS", "START_TEMPLATE", "END_TEMPLATE", "WORD", 
		"ID", "METRIC", "TOPICNAME", "ASTERISK", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ConnectorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConnectorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public Send_with_whereContext send_with_where() {
			return getRuleContext(Send_with_whereContext.class,0);
		}
		public Send_basicContext send_basic() {
			return getRuleContext(Send_basicContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				send_with_where();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				send_basic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_with_whereContext extends ParserRuleContext {
		public Send_clauseContext send_clause() {
			return getRuleContext(Send_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ConnectorParser.TO, 0); }
		public MetricContext metric() {
			return getRuleContext(MetricContext.class,0);
		}
		public Send_with_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_with_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSend_with_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSend_with_where(this);
		}
	}

	public final Send_with_whereContext send_with_where() throws RecognitionException {
		Send_with_whereContext _localctx = new Send_with_whereContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_send_with_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			send_clause();
			setState(35);
			where_clause();
			setState(36);
			match(TO);
			setState(37);
			metric();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_basicContext extends ParserRuleContext {
		public Send_clauseContext send_clause() {
			return getRuleContext(Send_clauseContext.class,0);
		}
		public TerminalNode TO() { return getToken(ConnectorParser.TO, 0); }
		public MetricContext metric() {
			return getRuleContext(MetricContext.class,0);
		}
		public Send_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSend_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSend_basic(this);
		}
	}

	public final Send_basicContext send_basic() throws RecognitionException {
		Send_basicContext _localctx = new Send_basicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_send_basic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			send_clause();
			setState(40);
			match(TO);
			setState(41);
			metric();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_clauseContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(ConnectorParser.SEND, 0); }
		public StattypeContext stattype() {
			return getRuleContext(StattypeContext.class,0);
		}
		public TerminalNode OF() { return getToken(ConnectorParser.OF, 0); }
		public Send_fieldContext send_field() {
			return getRuleContext(Send_fieldContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ConnectorParser.FROM, 0); }
		public TopicnameContext topicname() {
			return getRuleContext(TopicnameContext.class,0);
		}
		public Send_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSend_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSend_clause(this);
		}
	}

	public final Send_clauseContext send_clause() throws RecognitionException {
		Send_clauseContext _localctx = new Send_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_send_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SEND);
			setState(44);
			stattype();
			setState(45);
			match(OF);
			setState(46);
			send_field();
			setState(47);
			match(FROM);
			setState(48);
			topicname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ConnectorParser.WHERE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(WHERE);
			setState(51);
			comparison();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			lhs();
			setState(54);
			comp_op();
			setState(55);
			rhs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(ConnectorParser.EQUALS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comp_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(EQUALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(ConnectorParser.WORD, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ConnectorParser.STRING, 0); }
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(ConnectorParser.DECIMAL, 0); }
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitRhs(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DECIMAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(ConnectorParser.WORD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Send_fieldContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(ConnectorParser.ASTERISK, 0); }
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode WORD() { return getToken(ConnectorParser.WORD, 0); }
		public Send_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSend_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSend_field(this);
		}
	}

	public final Send_fieldContext send_field() throws RecognitionException {
		Send_fieldContext _localctx = new Send_fieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_send_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << ID) | (1L << ASTERISK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StattypeContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ConnectorParser.COUNT, 0); }
		public TerminalNode VALUE() { return getToken(ConnectorParser.VALUE, 0); }
		public StattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stattype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterStattype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitStattype(this);
		}
	}

	public final StattypeContext stattype() throws RecognitionException {
		StattypeContext _localctx = new StattypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==COUNT || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode START_TEMPLATE() { return getToken(ConnectorParser.START_TEMPLATE, 0); }
		public TerminalNode END_TEMPLATE() { return getToken(ConnectorParser.END_TEMPLATE, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			match(START_TEMPLATE);
			}
			setState(70);
			field();
			{
			setState(71);
			match(END_TEMPLATE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetricContext extends ParserRuleContext {
		public TerminalNode METRIC() { return getToken(ConnectorParser.METRIC, 0); }
		public TerminalNode WORD() { return getToken(ConnectorParser.WORD, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public MetricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterMetric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitMetric(this);
		}
	}

	public final MetricContext metric() throws RecognitionException {
		MetricContext _localctx = new MetricContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==METRIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_TEMPLATE) {
				{
				setState(74);
				template();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopicnameContext extends ParserRuleContext {
		public TerminalNode TOPICNAME() { return getToken(ConnectorParser.TOPICNAME, 0); }
		public TerminalNode WORD() { return getToken(ConnectorParser.WORD, 0); }
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode METRIC() { return getToken(ConnectorParser.METRIC, 0); }
		public TopicnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topicname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTopicname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTopicname(this);
		}
	}

	public final TopicnameContext topicname() throws RecognitionException {
		TopicnameContext _localctx = new TopicnameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_topicname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << ID) | (1L << METRIC) | (1L << TOPICNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\5\17N\n\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36\2\b\3\2\20\21\3\2\n\f\4\2\20\21\24\24\3\2"+
		"\4\5\4\2\20\20\22\22\3\2\20\23D\2\"\3\2\2\2\4$\3\2\2\2\6)\3\2\2\2\b-\3"+
		"\2\2\2\n\64\3\2\2\2\f\67\3\2\2\2\16;\3\2\2\2\20=\3\2\2\2\22?\3\2\2\2\24"+
		"A\3\2\2\2\26C\3\2\2\2\30E\3\2\2\2\32G\3\2\2\2\34K\3\2\2\2\36O\3\2\2\2"+
		" #\5\4\3\2!#\5\6\4\2\" \3\2\2\2\"!\3\2\2\2#\3\3\2\2\2$%\5\b\5\2%&\5\n"+
		"\6\2&\'\7\7\2\2\'(\5\34\17\2(\5\3\2\2\2)*\5\b\5\2*+\7\7\2\2+,\5\34\17"+
		"\2,\7\3\2\2\2-.\7\3\2\2./\5\30\r\2/\60\7\6\2\2\60\61\5\26\f\2\61\62\7"+
		"\b\2\2\62\63\5\36\20\2\63\t\3\2\2\2\64\65\7\t\2\2\65\66\5\f\7\2\66\13"+
		"\3\2\2\2\678\5\20\t\289\5\16\b\29:\5\22\n\2:\r\3\2\2\2;<\7\r\2\2<\17\3"+
		"\2\2\2=>\t\2\2\2>\21\3\2\2\2?@\t\3\2\2@\23\3\2\2\2AB\t\2\2\2B\25\3\2\2"+
		"\2CD\t\4\2\2D\27\3\2\2\2EF\t\5\2\2F\31\3\2\2\2GH\7\16\2\2HI\5\24\13\2"+
		"IJ\7\17\2\2J\33\3\2\2\2KM\t\6\2\2LN\5\32\16\2ML\3\2\2\2MN\3\2\2\2N\35"+
		"\3\2\2\2OP\t\7\2\2P\37\3\2\2\2\4\"M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}