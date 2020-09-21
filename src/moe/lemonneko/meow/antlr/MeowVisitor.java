// Generated from E:/Projects/IdeaProjects/Meow/src/moe/lemonneko/meow/antlr\Meow.g4 by ANTLR 4.8
package moe.lemonneko.meow.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeowParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(MeowParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(MeowParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(MeowParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#file_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_header(MeowParser.File_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#file_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_content(MeowParser.File_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#package_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_define(MeowParser.Package_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#package_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_using(MeowParser.Package_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(MeowParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#class_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(MeowParser.Class_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(MeowParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MeowParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MeowParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MeowParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#function_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_define(MeowParser.Function_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#function_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameter(MeowParser.Function_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(MeowParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(MeowParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#function_invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_invoke(MeowParser.Function_invokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MeowParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#float_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_number(MeowParser.Float_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeowParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MeowParser.ValueContext ctx);
	/**
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MeowParser.ExpressionContext ctx);
}