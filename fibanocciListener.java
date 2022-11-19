// Generated from fibanocci.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fibanocciParser}.
 */
public interface fibanocciListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(fibanocciParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(fibanocciParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fibanocciParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fibanocciParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(fibanocciParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(fibanocciParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(fibanocciParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(fibanocciParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(fibanocciParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(fibanocciParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(fibanocciParser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(fibanocciParser.Using_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(fibanocciParser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(fibanocciParser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(fibanocciParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(fibanocciParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(fibanocciParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(fibanocciParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(fibanocciParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(fibanocciParser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(fibanocciParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(fibanocciParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDimension_specifier(fibanocciParser.Dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDimension_specifier(fibanocciParser.Dimension_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(fibanocciParser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(fibanocciParser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(fibanocciParser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(fibanocciParser.Local_variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(fibanocciParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(fibanocciParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(fibanocciParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(fibanocciParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(fibanocciParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(fibanocciParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(fibanocciParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(fibanocciParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(fibanocciParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(fibanocciParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(fibanocciParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(fibanocciParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryoperator(fibanocciParser.BinaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryoperator(fibanocciParser.BinaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(fibanocciParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(fibanocciParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(fibanocciParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(fibanocciParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void enterBitwise(fibanocciParser.BitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#bitwise}.
	 * @param ctx the parse tree
	 */
	void exitBitwise(fibanocciParser.BitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(fibanocciParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(fibanocciParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(fibanocciParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(fibanocciParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(fibanocciParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(fibanocciParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#funcHeader}.
	 * @param ctx the parse tree
	 */
	void enterFuncHeader(fibanocciParser.FuncHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#funcHeader}.
	 * @param ctx the parse tree
	 */
	void exitFuncHeader(fibanocciParser.FuncHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(fibanocciParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(fibanocciParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(fibanocciParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(fibanocciParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link fibanocciParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(fibanocciParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link fibanocciParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(fibanocciParser.KeywordContext ctx);
}