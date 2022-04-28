package io.github.muqhc.skollobleparser.raw;// Generated from Skolloble.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkollobleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, Space=2, INTOATTR=3, BackNamespaceSign=4, ForeNamespaceSign=5, 
		ID=6, WholeWrap=7, SingleBlock=8, NoBlock=9, GoOutBLOCK=10, INTOBLOCK=11, 
		STRING=12, Comment=13;
	public static final int
		RULE_file = 0, RULE_element = 1, RULE_attribution = 2, RULE_block = 3, 
		RULE_attribute = 4, RULE_name = 5, RULE_backnamespace = 6, RULE_forenamespace = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "element", "attribution", "block", "attribute", "name", "backnamespace", 
			"forenamespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", "'@'", "'<>'", null, "'/'", "'-'", "';'", "'}'", 
			"'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "Space", "INTOATTR", "BackNamespaceSign", "ForeNamespaceSign", 
			"ID", "WholeWrap", "SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", 
			"STRING", "Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Skolloble.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkollobleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			element();
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

	public static class ElementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				name();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTOATTR) {
					{
					setState(19);
					attribution();
					}
				}

				setState(22);
				block();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode INTOATTR() { return getToken(SkollobleParser.INTOATTR, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(INTOATTR);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				attribute();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INTOBLOCK() { return getToken(SkollobleParser.INTOBLOCK, 0); }
		public TerminalNode GoOutBLOCK() { return getToken(SkollobleParser.GoOutBLOCK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode WholeWrap() { return getToken(SkollobleParser.WholeWrap, 0); }
		public TerminalNode SingleBlock() { return getToken(SkollobleParser.SingleBlock, 0); }
		public TerminalNode NoBlock() { return getToken(SkollobleParser.NoBlock, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTOBLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(INTOBLOCK);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==STRING) {
					{
					{
					setState(34);
					element();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(GoOutBLOCK);
				}
				break;
			case WholeWrap:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(WholeWrap);
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(42);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleBlock:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(SingleBlock);
				setState(48);
				element();
				}
				break;
			case NoBlock:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(NoBlock);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AttributeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			name();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(53);
				match(STRING);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public BacknamespaceContext backnamespace() {
			return getRuleContext(BacknamespaceContext.class,0);
		}
		public ForenamespaceContext forenamespace() {
			return getRuleContext(ForenamespaceContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(ID);
				setState(58);
				backnamespace();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				forenamespace();
				setState(60);
				match(ID);
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

	public static class BacknamespaceContext extends ParserRuleContext {
		public TerminalNode BackNamespaceSign() { return getToken(SkollobleParser.BackNamespaceSign, 0); }
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public BacknamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backnamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterBacknamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitBacknamespace(this);
		}
	}

	public final BacknamespaceContext backnamespace() throws RecognitionException {
		BacknamespaceContext _localctx = new BacknamespaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_backnamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(BackNamespaceSign);
			setState(65);
			match(ID);
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

	public static class ForenamespaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public TerminalNode ForeNamespaceSign() { return getToken(SkollobleParser.ForeNamespaceSign, 0); }
		public ForenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterForenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitForenamespace(this);
		}
	}

	public final ForenamespaceContext forenamespace() throws RecognitionException {
		ForenamespaceContext _localctx = new ForenamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(ForeNamespaceSign);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\5\3"+
		"\27\n\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\6\4 \n\4\r\4\16\4!\3\5\3\5\7\5"+
		"&\n\5\f\5\16\5)\13\5\3\5\3\5\3\5\6\5.\n\5\r\5\16\5/\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\6\3\6\5\69\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2K\2\22\3\2\2\2\4\33\3\2\2\2"+
		"\6\35\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20E\3\2"+
		"\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\26\5\f\7\2\25\27\5\6\4\2\26\25\3\2"+
		"\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\5\b\5\2\31\34\3\2\2\2\32\34\7\16"+
		"\2\2\33\24\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\37\7\5\2\2\36 \5\n\6"+
		"\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\7\3\2\2\2#\'\7\r\2"+
		"\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3"+
		"\2\2\2*\65\7\f\2\2+-\7\t\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/"+
		"\60\3\2\2\2\60\65\3\2\2\2\61\62\7\n\2\2\62\65\5\4\3\2\63\65\7\13\2\2\64"+
		"#\3\2\2\2\64+\3\2\2\2\64\61\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\668\5\f"+
		"\7\2\679\7\16\2\28\67\3\2\2\289\3\2\2\29\13\3\2\2\2:A\7\b\2\2;<\7\b\2"+
		"\2<A\5\16\b\2=>\5\20\t\2>?\7\b\2\2?A\3\2\2\2@:\3\2\2\2@;\3\2\2\2@=\3\2"+
		"\2\2A\r\3\2\2\2BC\7\6\2\2CD\7\b\2\2D\17\3\2\2\2EF\7\b\2\2FG\7\7\2\2G\21"+
		"\3\2\2\2\n\26\33!\'/\648@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}