package ast;

import java.util.*;

public class LocalVariableList {

    public LocalVariableList() {
       localList = new ArrayList<Variable>();
    }

    public void addElement(Variable v) {
       localList.add(v);
    }

    public Iterator<Variable> elements() {
        return localList.iterator();
    }

    public int getSize() {
        return localList.size();
    }

    public void genKra( PW pw ) {
    	for(Variable v : localList) {
    		pw.printlnIdent(v.getType().getCname() + " " + v.getName() + ";" );
    	}
	}

    
    public ArrayList<Variable> getLocalList() {
		return localList;
	}

	public void setLocalList(ArrayList<Variable> localList) {
		this.localList = localList;
	}


	private ArrayList<Variable> localList;

}
