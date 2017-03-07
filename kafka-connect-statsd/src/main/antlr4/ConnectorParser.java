// Generated from /home/mark/projects/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorParser.g4 by ANTLR 4.6
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
		SEND=1, COUNT=2, OF=3, TO=4, FROM=5, WHERE=6, EQUALS=7, TOPICNAME=8, METRIC=9;
	public static final int
		RULE_send_count_basic = 0;
	public static final String[] ruleNames = {
		"send_count_basic"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEND", "COUNT", "OF", "TO", "FROM", "WHERE", "EQUALS", "TOPICNAME", 
		"METRIC"
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
	public static class Send_count_basicContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(ConnectorParser.SEND, 0); }
		public TerminalNode COUNT() { return getToken(ConnectorParser.COUNT, 0); }
		public TerminalNode OF() { return getToken(ConnectorParser.OF, 0); }
		public TerminalNode TOPICNAME() { return getToken(ConnectorParser.TOPICNAME, 0); }
		public TerminalNode TO() { return getToken(ConnectorParser.TO, 0); }
		public TerminalNode METRIC() { return getToken(ConnectorParser.METRIC, 0); }
		public Send_count_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_count_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSend_count_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSend_count_basic(this);
		}
	}

	public final Send_count_basicContext send_count_basic() throws RecognitionException {
		Send_count_basicContext _localctx = new Send_count_basicContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_send_count_basic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(SEND);
			setState(3);
			match(COUNT);
			setState(4);
			match(OF);
			setState(5);
			match(TOPICNAME);
			setState(6);
			match(TO);
			setState(7);
			match(METRIC);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\f\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\n\2\4\3\2\2\2\4\5\7\3\2\2\5\6"+
		"\7\4\2\2\6\7\7\5\2\2\7\b\7\n\2\2\b\t\7\6\2\2\t\n\7\13\2\2\n\3\3\2\2\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}