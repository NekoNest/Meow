// Generated from E:/Projects/IdeaProjects/Meow/src/moe/lemonneko/meow/antlr\Meow.g4 by ANTLR 4.8
package moe.lemonneko.meow.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTI_LINE_COMMENT=2, DOCUMENT=3, PACKAGE=4, USING=5, 
		DOT=6, CLASS=7, TYPE=8, LEFT_BRACE=9, RIGHT_BRACE=10, VAR=11, VAL=12, 
		COLON=13, EQUALS=14, FUN=15, LEFT_BRACKET=16, RIGHT_BRACKET=17, PRIVATE=18, 
		PROTECTED=19, PUBLIC=20, STATIC=21, COMMA=22, DECIMAL_INTEGER=23, HEX_INTEGER=24, 
		BINARY_INTEGER=25, DECIMAL_FLOAT=26, STRING=27, MUL=28, DIV=29, ADD=30, 
		SUB=31, ID=32, WS=33;
	public static final int
		RULE_compilation_unit = 0, RULE_file = 1, RULE_comment = 2, RULE_file_header = 3, 
		RULE_file_content = 4, RULE_package_define = 5, RULE_package_using = 6, 
		RULE_package_name = 7, RULE_class_definition = 8, RULE_class_body = 9, 
		RULE_constant = 10, RULE_variable = 11, RULE_function = 12, RULE_function_define = 13, 
		RULE_function_parameter = 14, RULE_function_body = 15, RULE_modifier = 16, 
		RULE_function_invoke = 17, RULE_integer = 18, RULE_float_number = 19, 
		RULE_value = 20, RULE_expression = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "file", "comment", "file_header", "file_content", 
			"package_define", "package_using", "package_name", "class_definition", 
			"class_body", "constant", "variable", "function", "function_define", 
			"function_parameter", "function_body", "modifier", "function_invoke", 
			"integer", "float_number", "value", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'using'", "'.'", "'class'", null, 
			"'{'", "'}'", "'var'", "'val'", "':'", "'='", "'fun'", "'('", "')'", 
			"'private'", "'protected'", "'public'", "'static'", "','", null, null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "DOCUMENT", "PACKAGE", 
			"USING", "DOT", "CLASS", "TYPE", "LEFT_BRACE", "RIGHT_BRACE", "VAR", 
			"VAL", "COLON", "EQUALS", "FUN", "LEFT_BRACKET", "RIGHT_BRACKET", "PRIVATE", 
			"PROTECTED", "PUBLIC", "STATIC", "COMMA", "DECIMAL_INTEGER", "HEX_INTEGER", 
			"BINARY_INTEGER", "DECIMAL_FLOAT", "STRING", "MUL", "DIV", "ADD", "SUB", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "Meow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MeowParser.EOF, 0); }
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			file();
			setState(45);
			match(EOF);
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

	public static class FileContext extends ParserRuleContext {
		public File_headerContext file_header() {
			return getRuleContext(File_headerContext.class,0);
		}
		public File_contentContext file_content() {
			return getRuleContext(File_contentContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			file_header();
			setState(48);
			file_content();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_LINE_COMMENT) | (1L << MULTI_LINE_COMMENT) | (1L << DOCUMENT))) != 0)) {
				{
				{
				setState(49);
				comment();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(MeowParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(MeowParser.MULTI_LINE_COMMENT, 0); }
		public TerminalNode DOCUMENT() { return getToken(MeowParser.DOCUMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_LINE_COMMENT) | (1L << MULTI_LINE_COMMENT) | (1L << DOCUMENT))) != 0)) ) {
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

	public static class File_headerContext extends ParserRuleContext {
		public Package_defineContext package_define() {
			return getRuleContext(Package_defineContext.class,0);
		}
		public List<Package_usingContext> package_using() {
			return getRuleContexts(Package_usingContext.class);
		}
		public Package_usingContext package_using(int i) {
			return getRuleContext(Package_usingContext.class,i);
		}
		public File_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFile_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_headerContext file_header() throws RecognitionException {
		File_headerContext _localctx = new File_headerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_file_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(57);
				package_define();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USING) {
				{
				{
				setState(60);
				package_using();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class File_contentContext extends ParserRuleContext {
		public List<Class_definitionContext> class_definition() {
			return getRuleContexts(Class_definitionContext.class);
		}
		public Class_definitionContext class_definition(int i) {
			return getRuleContext(Class_definitionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public File_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFile_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_contentContext file_content() throws RecognitionException {
		File_contentContext _localctx = new File_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_file_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VAR) | (1L << VAL) | (1L << FUN) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(66);
					class_definition();
					}
					break;
				case 2:
					{
					setState(67);
					variable();
					}
					break;
				case 3:
					{
					setState(68);
					constant();
					}
					break;
				case 4:
					{
					setState(69);
					function();
					}
					break;
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Package_defineContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(MeowParser.PACKAGE, 0); }
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public Package_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPackage_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_defineContext package_define() throws RecognitionException {
		Package_defineContext _localctx = new Package_defineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_package_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PACKAGE);
			setState(76);
			package_name();
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

	public static class Package_usingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MeowParser.USING, 0); }
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public Package_usingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_using; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPackage_using(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_usingContext package_using() throws RecognitionException {
		Package_usingContext _localctx = new Package_usingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_package_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(USING);
			setState(79);
			package_name();
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

	public static class Package_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MeowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MeowParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MeowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MeowParser.DOT, i);
		}
		public Package_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitPackage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_nameContext package_name() throws RecognitionException {
		Package_nameContext _localctx = new Package_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_package_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(ID);
					setState(82);
					match(DOT);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(88);
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

	public static class Class_definitionContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MeowParser.CLASS, 0); }
		public TerminalNode TYPE() { return getToken(MeowParser.TYPE, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MeowParser.LEFT_BRACE, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MeowParser.RIGHT_BRACE, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			modifier();
			setState(91);
			match(CLASS);
			setState(92);
			match(TYPE);
			setState(93);
			match(LEFT_BRACE);
			setState(94);
			class_body();
			setState(95);
			match(RIGHT_BRACE);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Class_definitionContext> class_definition() {
			return getRuleContexts(Class_definitionContext.class);
		}
		public Class_definitionContext class_definition(int i) {
			return getRuleContext(Class_definitionContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VAR) | (1L << VAL) | (1L << FUN) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(97);
					variable();
					}
					break;
				case 2:
					{
					setState(98);
					constant();
					}
					break;
				case 3:
					{
					setState(99);
					function();
					}
					break;
				case 4:
					{
					setState(100);
					class_definition();
					}
					break;
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConstantContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode VAL() { return getToken(MeowParser.VAL, 0); }
		public TerminalNode ID() { return getToken(MeowParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MeowParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MeowParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(MeowParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			modifier();
			setState(107);
			match(VAL);
			setState(108);
			match(ID);
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(109);
				match(COLON);
				setState(110);
				match(TYPE);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(111);
					match(EQUALS);
					setState(112);
					expression(0);
					}
				}

				}
				break;
			case EQUALS:
				{
				setState(115);
				match(EQUALS);
				setState(116);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MeowParser.VAR, 0); }
		public TerminalNode ID() { return getToken(MeowParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MeowParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MeowParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(MeowParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			modifier();
			setState(120);
			match(VAR);
			setState(121);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(122);
				match(COLON);
				setState(123);
				match(TYPE);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(124);
					match(EQUALS);
					setState(125);
					expression(0);
					}
				}

				}
				break;
			case EQUALS:
				{
				setState(128);
				match(EQUALS);
				setState(129);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_defineContext function_define() {
			return getRuleContext(Function_defineContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MeowParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			function_define();
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				{
				setState(133);
				function_body();
				}
				break;
			case EQUALS:
				{
				setState(134);
				match(EQUALS);
				setState(135);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Function_defineContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode FUN() { return getToken(MeowParser.FUN, 0); }
		public TerminalNode ID() { return getToken(MeowParser.ID, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(MeowParser.LEFT_BRACKET, 0); }
		public Function_parameterContext function_parameter() {
			return getRuleContext(Function_parameterContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MeowParser.RIGHT_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(MeowParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MeowParser.TYPE, 0); }
		public Function_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunction_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defineContext function_define() throws RecognitionException {
		Function_defineContext _localctx = new Function_defineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			modifier();
			setState(139);
			match(FUN);
			setState(140);
			match(ID);
			setState(141);
			match(LEFT_BRACKET);
			setState(142);
			function_parameter();
			setState(143);
			match(RIGHT_BRACKET);
			setState(144);
			match(COLON);
			setState(145);
			match(TYPE);
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

	public static class Function_parameterContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MeowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MeowParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MeowParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MeowParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(MeowParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MeowParser.TYPE, i);
		}
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunction_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(147);
				match(ID);
				setState(148);
				match(COLON);
				setState(149);
				match(TYPE);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(MeowParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MeowParser.RIGHT_BRACE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LEFT_BRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << LEFT_BRACKET) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << DECIMAL_INTEGER) | (1L << HEX_INTEGER) | (1L << BINARY_INTEGER) | (1L << DECIMAL_FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(156);
					variable();
					}
					break;
				case 2:
					{
					setState(157);
					constant();
					}
					break;
				case 3:
					{
					setState(158);
					expression(0);
					}
					break;
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RIGHT_BRACE);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(MeowParser.STATIC, 0); }
		public TerminalNode PRIVATE() { return getToken(MeowParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(MeowParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(MeowParser.PUBLIC, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(166);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(169);
				match(STATIC);
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

	public static class Function_invokeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MeowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MeowParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(MeowParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(MeowParser.RIGHT_BRACKET, 0); }
		public TerminalNode DOT() { return getToken(MeowParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MeowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MeowParser.COMMA, i);
		}
		public Function_invokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invoke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFunction_invoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invokeContext function_invoke() throws RecognitionException {
		Function_invokeContext _localctx = new Function_invokeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_invoke);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(172);
				match(ID);
				setState(173);
				match(DOT);
				}
				break;
			}
			setState(176);
			match(ID);
			setState(177);
			match(LEFT_BRACKET);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					expression(0);
					setState(179);
					match(COMMA);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << DECIMAL_INTEGER) | (1L << HEX_INTEGER) | (1L << BINARY_INTEGER) | (1L << DECIMAL_FLOAT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(186);
				expression(0);
				}
			}

			setState(189);
			match(RIGHT_BRACKET);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(MeowParser.DECIMAL_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(MeowParser.HEX_INTEGER, 0); }
		public TerminalNode BINARY_INTEGER() { return getToken(MeowParser.BINARY_INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_INTEGER) | (1L << HEX_INTEGER) | (1L << BINARY_INTEGER))) != 0)) ) {
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

	public static class Float_numberContext extends ParserRuleContext {
		public TerminalNode DECIMAL_FLOAT() { return getToken(MeowParser.DECIMAL_FLOAT, 0); }
		public Float_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitFloat_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_numberContext float_number() throws RecognitionException {
		Float_numberContext _localctx = new Float_numberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_float_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(DECIMAL_FLOAT);
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

	public static class ValueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Float_numberContext float_number() {
			return getRuleContext(Float_numberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MeowParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case HEX_INTEGER:
			case BINARY_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				integer();
				}
				break;
			case DECIMAL_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				float_number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(MeowParser.LEFT_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(MeowParser.RIGHT_BRACKET, 0); }
		public Function_invokeContext function_invoke() {
			return getRuleContext(Function_invokeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(MeowParser.ID, 0); }
		public TerminalNode MUL() { return getToken(MeowParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MeowParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(MeowParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MeowParser.SUB, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeowVisitor ) return ((MeowVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(201);
				match(LEFT_BRACKET);
				setState(202);
				expression(0);
				setState(203);
				match(RIGHT_BRACKET);
				}
				break;
			case 2:
				{
				setState(205);
				function_invoke();
				}
				break;
			case 3:
				{
				setState(206);
				value();
				}
				break;
			case 4:
				{
				setState(207);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(211);
						match(MUL);
						setState(212);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(214);
						match(DIV);
						setState(215);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(217);
						match(ADD);
						setState(218);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(220);
						match(SUB);
						setState(221);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\5\5\5=\n\5\3\5\7\5@\n\5\f\5\16"+
		"\5C\13\5\3\6\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\7\tV\n\t\f\t\16\tY\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\7\13h\n\13\f\13\16\13k\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\ft\n\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081"+
		"\n\r\3\r\3\r\5\r\u0085\n\r\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0099\n\20"+
		"\f\20\16\20\u009c\13\20\3\21\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21"+
		"\u00a5\13\21\3\21\3\21\3\22\5\22\u00aa\n\22\3\22\5\22\u00ad\n\22\3\23"+
		"\3\23\5\23\u00b1\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u00b8\n\23\f\23\16"+
		"\23\u00bb\13\23\3\23\5\23\u00be\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\5\26\u00c9\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u00d3\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3\27\2\3,\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\3\5\3\2\24\26\3\2\31\33\2\u00f2"+
		"\2.\3\2\2\2\4\61\3\2\2\2\69\3\2\2\2\b<\3\2\2\2\nJ\3\2\2\2\fM\3\2\2\2\16"+
		"P\3\2\2\2\20W\3\2\2\2\22\\\3\2\2\2\24i\3\2\2\2\26l\3\2\2\2\30y\3\2\2\2"+
		"\32\u0086\3\2\2\2\34\u008c\3\2\2\2\36\u009a\3\2\2\2 \u009d\3\2\2\2\"\u00a9"+
		"\3\2\2\2$\u00b0\3\2\2\2&\u00c1\3\2\2\2(\u00c3\3\2\2\2*\u00c8\3\2\2\2,"+
		"\u00d2\3\2\2\2./\5\4\3\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\5\b\5\2\62\66"+
		"\5\n\6\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\5\3\2\2\28\66\3\2\2\29:\t\2\2\2:\7\3\2\2\2;=\5\f\7\2<;\3\2\2"+
		"\2<=\3\2\2\2=A\3\2\2\2>@\5\16\b\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\t\3\2\2\2CA\3\2\2\2DI\5\22\n\2EI\5\30\r\2FI\5\26\f\2GI\5\32\16\2"+
		"HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\13\3\2\2\2LJ\3\2\2\2MN\7\6\2\2NO\5\20\t\2O\r\3\2\2\2PQ\7\7\2\2QR\5\20"+
		"\t\2R\17\3\2\2\2ST\7\"\2\2TV\7\b\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\"\2\2[\21\3\2\2\2\\]\5\"\22\2]^\7\t\2\2"+
		"^_\7\n\2\2_`\7\13\2\2`a\5\24\13\2ab\7\f\2\2b\23\3\2\2\2ch\5\30\r\2dh\5"+
		"\26\f\2eh\5\32\16\2fh\5\22\n\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\25\3\2\2\2ki\3\2\2\2lm\5\"\22\2mn\7\16"+
		"\2\2nw\7\"\2\2op\7\17\2\2ps\7\n\2\2qr\7\20\2\2rt\5,\27\2sq\3\2\2\2st\3"+
		"\2\2\2tx\3\2\2\2uv\7\20\2\2vx\5,\27\2wo\3\2\2\2wu\3\2\2\2x\27\3\2\2\2"+
		"yz\5\"\22\2z{\7\r\2\2{\u0084\7\"\2\2|}\7\17\2\2}\u0080\7\n\2\2~\177\7"+
		"\20\2\2\177\u0081\5,\27\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0085"+
		"\3\2\2\2\u0082\u0083\7\20\2\2\u0083\u0085\5,\27\2\u0084|\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\31\3\2\2\2\u0086\u008a\5\34\17\2\u0087\u008b\5 \21"+
		"\2\u0088\u0089\7\20\2\2\u0089\u008b\5,\27\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7\21"+
		"\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\36\20\2\u0091"+
		"\u0092\7\23\2\2\u0092\u0093\7\17\2\2\u0093\u0094\7\n\2\2\u0094\35\3\2"+
		"\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7\17\2\2\u0097\u0099\7\n\2\2\u0098"+
		"\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\37\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a3\7\13\2\2\u009e\u00a2"+
		"\5\30\r\2\u009f\u00a2\5\26\f\2\u00a0\u00a2\5,\27\2\u00a1\u009e\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\f\2\2\u00a7!\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\7\27\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00af\7\"\2\2\u00af"+
		"\u00b1\7\b\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b9\7\22\2\2\u00b4\u00b5\5,\27\2\u00b5"+
		"\u00b6\7\30\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\5,\27\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0%\3\2\2\2\u00c1\u00c2"+
		"\t\4\2\2\u00c2\'\3\2\2\2\u00c3\u00c4\7\34\2\2\u00c4)\3\2\2\2\u00c5\u00c9"+
		"\5&\24\2\u00c6\u00c9\5(\25\2\u00c7\u00c9\7\35\2\2\u00c8\u00c5\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00cb\b"+
		"\27\1\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\7\23\2\2"+
		"\u00ce\u00d3\3\2\2\2\u00cf\u00d3\5$\23\2\u00d0\u00d3\5*\26\2\u00d1\u00d3"+
		"\7\"\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00e2\3\2\2\2\u00d4\u00d5\f\6\2\2\u00d5\u00d6\7\36"+
		"\2\2\u00d6\u00e1\5,\27\7\u00d7\u00d8\f\5\2\2\u00d8\u00d9\7\37\2\2\u00d9"+
		"\u00e1\5,\27\6\u00da\u00db\f\4\2\2\u00db\u00dc\7 \2\2\u00dc\u00e1\5,\27"+
		"\5\u00dd\u00de\f\3\2\2\u00de\u00df\7!\2\2\u00df\u00e1\5,\27\4\u00e0\u00d4"+
		"\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3-\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\33\66<AHJWgisw\u0080\u0084\u008a\u009a\u00a1\u00a3"+
		"\u00a9\u00ac\u00b0\u00b9\u00bd\u00c8\u00d2\u00e0\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}