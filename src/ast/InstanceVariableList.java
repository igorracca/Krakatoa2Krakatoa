package ast;

import java.util.*;

public class InstanceVariableList {

    public InstanceVariableList() {
       instanceVariableList = new ArrayList<InstanceVariable>();
    }

    public void addElement(InstanceVariable instanceVariable) {
       instanceVariableList.add( instanceVariable );
    }
    
    public void add(InstanceVariableList ivl) {
    	instanceVariableList.addAll( ivl.instanceVariableList );
     }

    public Iterator<InstanceVariable> elements() {
    	return this.instanceVariableList.iterator();
    }

    public int getSize() {
        return instanceVariableList.size();
    }

    public void genKra(PW pw) {
    	for(InstanceVariable v : instanceVariableList) {
 		   v.genKra(pw);
 		   pw.println(";");
    	}
    }
    
    private ArrayList<InstanceVariable> instanceVariableList;

}
