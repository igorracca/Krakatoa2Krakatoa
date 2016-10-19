package ast;

import java.util.*;

public class ParamList {

    public ParamList() {
       paramList = new ArrayList<Parameter>();
    }

    public void addElement(Parameter p) {
       paramList.add(p);
    }

    public Iterator<Parameter> elements() {
        return paramList.iterator();
    }

    public ArrayList<Parameter> getParamList() {
		return paramList;
	}

	public void setParamList(ArrayList<Parameter> paramList) {
		this.paramList = paramList;
	}

	public int getSize() {
        return paramList.size();
    }

    public void genKra(PW pw) {
    	int c=1;
    	for(Parameter p : paramList) {
    		p.genKra(pw);
    		if(c != getSize()) {
    			pw.print(", ");
    			c++;
    		}
    	}
    }
    
    private ArrayList<Parameter> paramList;

}
