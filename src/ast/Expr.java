package ast;

abstract public class Expr extends AssignExprLocalDecStatement {
    abstract public void genC( PW pw, boolean putParenthesis );
      // new method: the type of the expression
    abstract public Type getType();
}