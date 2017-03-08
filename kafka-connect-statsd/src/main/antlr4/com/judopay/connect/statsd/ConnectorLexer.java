// Generated from /home/mark/projects/judo/kafka-connect-statsd/kafka-connect-statsd/src/main/antlr4/ConnectorLexer.g4 by ANTLR 4.6
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
		SEND=1, COUNT=2, VALUE=3, OF=4, TO=5, FROM=6, WHERE=7, EQUALS=8, TOPICNAME=9, 
		METRIC=10, MESSAGES=11, ID=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "EQUALS", "TOPICNAME", 
		"METRIC", "MESSAGES", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEND", "COUNT", "VALUE", "OF", "TO", "FROM", "WHERE", "EQUALS", 
		"TOPICNAME", "METRIC", "MESSAGES", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"&\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\5\5D\n\5\3\6\3\6\3"+
		"\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\n\6\ne\n\n\r\n\16\nf\3\13"+
		"\6\13j\n\13\r\13\16\13k\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\16\6\16"+
		"\u0086\n\16\r\16\16\16\u0087\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\7\2--/;C\\aac|\6\2\60\60"+
		"\62;C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u0096\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3%\3\2\2\2\5\61\3\2\2\2\7=\3\2\2\2\tC\3\2\2\2\13I\3\2\2\2\rS\3\2"+
		"\2\2\17_\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25i\3\2\2\2\27}\3\2\2\2\31\u0080"+
		"\3\2\2\2\33\u0085\3\2\2\2\35\36\7u\2\2\36\37\7g\2\2\37 \7p\2\2 &\7f\2"+
		"\2!\"\7U\2\2\"#\7G\2\2#$\7P\2\2$&\7F\2\2%\35\3\2\2\2%!\3\2\2\2&\4\3\2"+
		"\2\2\'(\7e\2\2()\7q\2\2)*\7w\2\2*+\7p\2\2+\62\7v\2\2,-\7E\2\2-.\7Q\2\2"+
		"./\7W\2\2/\60\7P\2\2\60\62\7V\2\2\61\'\3\2\2\2\61,\3\2\2\2\62\6\3\2\2"+
		"\2\63\64\7x\2\2\64\65\7c\2\2\65\66\7n\2\2\66\67\7w\2\2\67>\7g\2\289\7"+
		"X\2\29:\7C\2\2:;\7N\2\2;<\7W\2\2<>\7G\2\2=\63\3\2\2\2=8\3\2\2\2>\b\3\2"+
		"\2\2?@\7q\2\2@D\7h\2\2AB\7Q\2\2BD\7H\2\2C?\3\2\2\2CA\3\2\2\2D\n\3\2\2"+
		"\2EF\7v\2\2FJ\7q\2\2GH\7V\2\2HJ\7Q\2\2IE\3\2\2\2IG\3\2\2\2J\f\3\2\2\2"+
		"KL\7h\2\2LM\7t\2\2MN\7q\2\2NT\7o\2\2OP\7H\2\2PQ\7T\2\2QR\7Q\2\2RT\7O\2"+
		"\2SK\3\2\2\2SO\3\2\2\2T\16\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7g\2\2XY\7t\2\2"+
		"Y`\7g\2\2Z[\7Y\2\2[\\\7J\2\2\\]\7G\2\2]^\7T\2\2^`\7G\2\2_U\3\2\2\2_Z\3"+
		"\2\2\2`\20\3\2\2\2ab\7?\2\2b\22\3\2\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2g\24\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2l\26\3\2\2\2mn\7o\2\2no\7g\2\2op\7u\2\2pq\7u\2\2qr\7c\2\2"+
		"rs\7i\2\2st\7g\2\2t~\7u\2\2uv\7O\2\2vw\7G\2\2wx\7U\2\2xy\7U\2\2yz\7C\2"+
		"\2z{\7I\2\2{|\7G\2\2|~\7U\2\2}m\3\2\2\2}u\3\2\2\2~\30\3\2\2\2\177\u0081"+
		"\t\4\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\32\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\b\16\2\2\u008a\34\3\2\2\2\17\2%\61=CIS_fk}\u0082"+
		"\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}