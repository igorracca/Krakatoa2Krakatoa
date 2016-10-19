package ast;

import java.util.ArrayList;
import java.util.Iterator;

public class StatementList {

	public StatementList() {
		statementList = new ArrayList<Statement>();
	}
	
	public void addElement(Statement s) {
       statementList.add( s );
    }
    
    public void add(StatementList sl) {
    	statementList.addAll( sl.statementList );
     }

    public Iterator<Statement> elements() {
    	return this.statementList.iterator();
    }

    public int getSize() {
        return statementList.size();
    }

	public void genKra(PW pw) {
    	for(Statement s : statementList) {
 		   s.genKra(pw);
    	}
    }
		
	private ArrayList<Statement> statementList;
}
