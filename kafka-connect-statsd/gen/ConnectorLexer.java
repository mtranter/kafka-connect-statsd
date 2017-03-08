// Generated from /home/marktranter/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorLexer.g4 by ANTLR 4.6

 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEND=1, COUNT=2, VALUE=3, OF=4, TO=5, FROM=6, WHERE=7, EQUALS=8, TOPICNAME=9, 
		METRIC=10, MESSAGES=11, ID=12, ASTERISK=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "EQUALS", "TOPICNAME", 
		"METRIC", "MESSAGES", "ID", "ASTERISK", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'='", null, null, null, 
		null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "EQUALS", 
		"TOPICNAME", "METRIC", "MESSAGES", "ID", "ASTERISK", "WS"
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


	public ConnectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConnectorLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\5\5F\n\5"+
		"\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\n\6\ng\n\n\r\n"+
		"\16\nh\3\13\6\13l\n\13\r\13\16\13m\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\6\r\u0083\n\r\r\r\16\r"+
		"\u0084\3\16\3\16\3\17\6\17\u008a\n\17\r\17\16\17\u008b\3\17\3\17\2\2\20"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\3\2\6\7\2--/;C\\aac|\6\2\60\60\62;C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\""+
		"\"\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\'\3\2\2\2\5\63\3\2\2"+
		"\2\7?\3\2\2\2\tE\3\2\2\2\13K\3\2\2\2\rU\3\2\2\2\17a\3\2\2\2\21c\3\2\2"+
		"\2\23f\3\2\2\2\25k\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2\2\33\u0086\3"+
		"\2\2\2\35\u0089\3\2\2\2\37 \7u\2\2 !\7g\2\2!\"\7p\2\2\"(\7f\2\2#$\7U\2"+
		"\2$%\7G\2\2%&\7P\2\2&(\7F\2\2\'\37\3\2\2\2\'#\3\2\2\2(\4\3\2\2\2)*\7e"+
		"\2\2*+\7q\2\2+,\7w\2\2,-\7p\2\2-\64\7v\2\2./\7E\2\2/\60\7Q\2\2\60\61\7"+
		"W\2\2\61\62\7P\2\2\62\64\7V\2\2\63)\3\2\2\2\63.\3\2\2\2\64\6\3\2\2\2\65"+
		"\66\7x\2\2\66\67\7c\2\2\678\7n\2\289\7w\2\29@\7g\2\2:;\7X\2\2;<\7C\2\2"+
		"<=\7N\2\2=>\7W\2\2>@\7G\2\2?\65\3\2\2\2?:\3\2\2\2@\b\3\2\2\2AB\7q\2\2"+
		"BF\7h\2\2CD\7Q\2\2DF\7H\2\2EA\3\2\2\2EC\3\2\2\2F\n\3\2\2\2GH\7v\2\2HL"+
		"\7q\2\2IJ\7V\2\2JL\7Q\2\2KG\3\2\2\2KI\3\2\2\2L\f\3\2\2\2MN\7h\2\2NO\7"+
		"t\2\2OP\7q\2\2PV\7o\2\2QR\7H\2\2RS\7T\2\2ST\7Q\2\2TV\7O\2\2UM\3\2\2\2"+
		"UQ\3\2\2\2V\16\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7g\2\2Z[\7t\2\2[b\7g\2\2\\"+
		"]\7Y\2\2]^\7J\2\2^_\7G\2\2_`\7T\2\2`b\7G\2\2aW\3\2\2\2a\\\3\2\2\2b\20"+
		"\3\2\2\2cd\7?\2\2d\22\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\24\3\2\2\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2"+
		"\2n\26\3\2\2\2op\7o\2\2pq\7g\2\2qr\7u\2\2rs\7u\2\2st\7c\2\2tu\7i\2\2u"+
		"v\7g\2\2v\u0080\7u\2\2wx\7O\2\2xy\7G\2\2yz\7U\2\2z{\7U\2\2{|\7C\2\2|}"+
		"\7I\2\2}~\7G\2\2~\u0080\7U\2\2\177o\3\2\2\2\177w\3\2\2\2\u0080\30\3\2"+
		"\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\32\3\2\2\2\u0086\u0087\7,\2\2"+
		"\u0087\34\3\2\2\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\17\2\2\u008e\36\3\2\2\2\17\2\'\63?EKUahm\177\u0084\u008b\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}