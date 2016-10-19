package ast;

public class AssignExprLocalDecStatement extends Statement {

	public AssignExprLocalDecStatement() {

	}

	@Override
	public void genC(PW pw) {
		
	}
	
	@Override
	public void genKra(PW pw) {
		localVariableList.genKra(pw);
	}
	
	public LocalVariableList getLocalVariableList() {
		return localVariableList;
	}

	public void setLocalVariableList(LocalVariableList localVariableList) {
		this.localVariableList = localVariableList;
	}

	public ExprList getExprList() {
		return exprList;
	}

	public void setExprList(ExprList exprList) {
		this.exprList = exprList;
	}
	
	public void addLocalVariableList(LocalVariableList localVariableList) {
		this.localVariableList = localVariableList;
	}
	
	public void addExprList(ExprList exprList) {
		this.exprList = exprList;
	}
	
	private LocalVariableList localVariableList = new LocalVariableList();
	
	private ExprList exprList = new ExprList();

}
