package ast;

public class PrivateMethod extends Method {

	public PrivateMethod(String name, Type type ) {
		super(name, type);
	}

	@Override
	public void genKra(PW pw) {
		pw.out.print("private " + super.getType().getCname() + " " + super.getName() + "(");
		getParamList().genKra(pw);
		pw.out.println(") {");
		pw.add();
			getStatementList().genKra(pw);
		pw.sub();
		pw.out.println("}");
	}

}
