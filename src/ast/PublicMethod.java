package ast;

public class PublicMethod extends Method {

	public PublicMethod(String name, Type type ) {
		super(name, type);
	}

	@Override
	public void genKra(PW pw) {
		pw.printIdent("public " + super.getType().getCname() + " " + super.getName() + "(");
		getParamList().genKra(pw);
		pw.println(") {");
		pw.add();
			getStatementList().genKra(pw);
		pw.sub();
		pw.printlnIdent("}");
	}

}
