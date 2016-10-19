package ast;

public abstract class Method {
	
	public Method(String name, Type type) {
		this.name = name;
        this.type = type;
		pl = new ParamList();
		sl = new StatementList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public ParamList getParamList() {
		return pl;
	}

	public void setParamList(ParamList pl) {
		this.pl = pl;
	}
	
	public void setStatementList(StatementList sl) {
		this.sl = sl;
	}
	
	public StatementList getStatementList() {
		return sl;
	}
	
	abstract public void genKra(PW pw);

	private String name;
    private Type type;
	private ParamList pl;
	private StatementList sl;
	
}
