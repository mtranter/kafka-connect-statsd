// Generated from /home/marktranter/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorLexer.g4 by ANTLR 4.6
package com.judopay.connect.statsd;

 
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
		SEND=1, COUNT=2, VALUE=3, OF=4, TO=5, FROM=6, WHERE=7, STRING=8, INT=9, 
		DECIMAL=10, EQUALS=11, START_TEMPLATE=12, END_TEMPLATE=13, WORD=14, ID=15, 
		METRIC=16, TOPICNAME=17, ASTERISK=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "STRING", "INT", 
		"DECIMAL", "EQUALS", "START_TEMPLATE", "END_TEMPLATE", "WORD", "ID", "METRIC", 
		"TOPICNAME", "ASTERISK", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3\5\3"+
		"\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bt\n\b\3\t\3\t\7"+
		"\tx\n\t\f\t\16\t{\13\t\3\t\3\t\3\n\6\n\u0080\n\n\r\n\16\n\u0081\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u0093"+
		"\n\20\6\20\u0095\n\20\r\20\16\20\u0096\3\21\3\21\3\21\5\21\u009c\n\21"+
		"\6\21\u009e\n\21\r\21\16\21\u009f\3\22\3\22\3\22\5\22\u00a5\n\22\6\22"+
		"\u00a7\n\22\r\22\16\22\u00a8\3\23\3\23\3\24\6\24\u00ae\n\24\r\24\16\24"+
		"\u00af\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\5\4\2C\\c|\6\2--//"+
		"\61\61aa\5\2\13\f\17\17\"\"\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3\61\3\2"+
		"\2\2\5A\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2\13]\3\2\2\2\rg\3\2\2\2\17s\3\2\2"+
		"\2\21u\3\2\2\2\23\177\3\2\2\2\25\u0083\3\2\2\2\27\u0087\3\2\2\2\31\u0089"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0094\3\2\2\2!\u009d\3\2"+
		"\2\2#\u00a6\3\2\2\2%\u00aa\3\2\2\2\'\u00ad\3\2\2\2)*\7u\2\2*+\7g\2\2+"+
		",\7p\2\2,\62\7f\2\2-.\7U\2\2./\7G\2\2/\60\7P\2\2\60\62\7F\2\2\61)\3\2"+
		"\2\2\61-\3\2\2\2\62\4\3\2\2\2\63\64\7e\2\2\64\65\7q\2\2\65\66\7w\2\2\66"+
		"\67\7p\2\2\678\7v\2\289\7*\2\29B\7+\2\2:;\7E\2\2;<\7Q\2\2<=\7W\2\2=>\7"+
		"P\2\2>?\7V\2\2?@\7*\2\2@B\7+\2\2A\63\3\2\2\2A:\3\2\2\2B\6\3\2\2\2CD\7"+
		"x\2\2DE\7c\2\2EF\7n\2\2FG\7w\2\2GH\7g\2\2HI\7*\2\2IR\7+\2\2JK\7X\2\2K"+
		"L\7C\2\2LM\7N\2\2MN\7W\2\2NO\7G\2\2OP\7*\2\2PR\7+\2\2QC\3\2\2\2QJ\3\2"+
		"\2\2R\b\3\2\2\2ST\7q\2\2TX\7h\2\2UV\7Q\2\2VX\7H\2\2WS\3\2\2\2WU\3\2\2"+
		"\2X\n\3\2\2\2YZ\7v\2\2Z^\7q\2\2[\\\7V\2\2\\^\7Q\2\2]Y\3\2\2\2][\3\2\2"+
		"\2^\f\3\2\2\2_`\7h\2\2`a\7t\2\2ab\7q\2\2bh\7o\2\2cd\7H\2\2de\7T\2\2ef"+
		"\7Q\2\2fh\7O\2\2g_\3\2\2\2gc\3\2\2\2h\16\3\2\2\2ij\7y\2\2jk\7j\2\2kl\7"+
		"g\2\2lm\7t\2\2mt\7g\2\2no\7Y\2\2op\7J\2\2pq\7G\2\2qr\7T\2\2rt\7G\2\2s"+
		"i\3\2\2\2sn\3\2\2\2t\20\3\2\2\2uy\7)\2\2vx\13\2\2\2wv\3\2\2\2x{\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7)\2\2}\22\3\2\2\2~\u0080"+
		"\4\62;\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\24\3\2\2\2\u0083\u0084\5\23\n\2\u0084\u0085\7\60\2\2\u0085"+
		"\u0086\5\23\n\2\u0086\26\3\2\2\2\u0087\u0088\7?\2\2\u0088\30\3\2\2\2\u0089"+
		"\u008a\7&\2\2\u008a\u008b\7}\2\2\u008b\32\3\2\2\2\u008c\u008d\7\177\2"+
		"\2\u008d\34\3\2\2\2\u008e\u008f\t\2\2\2\u008f\36\3\2\2\2\u0090\u0092\5"+
		"\35\17\2\u0091\u0093\4\62;\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097 \3\2\2\2\u0098\u009e\5\35\17\2\u0099\u009b"+
		"\5\35\17\2\u009a\u009c\7\60\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2"+
		"\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a7\5!\21\2\u00a2\u00a4\5!\21\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab&\3\2\2\2\u00ac\u00ae\t\4"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\24\2\2\u00b2(\3\2\2\2"+
		"\25\2\61AQW]gsy\u0081\u0092\u0096\u009b\u009d\u009f\u00a4\u00a6\u00a8"+
		"\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}