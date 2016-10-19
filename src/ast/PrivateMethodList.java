package ast;

import java.util.ArrayList;
import java.util.Iterator;

public class PrivateMethodList {

	public PrivateMethodList() {
    	privateMethodList = new ArrayList<PrivateMethod>();
     }

	public void addElement(PrivateMethod pm) {
    	 privateMethodList.add(pm);
     }

	public Iterator<PrivateMethod> elements() {
         return privateMethodList.iterator();
     }

	public ArrayList<PrivateMethod> getprivateMethod() {
 		return privateMethodList;
 	}

	public void setParamList(ArrayList<PrivateMethod> privateMethodList) {
 		this.privateMethodList = privateMethodList;
 	}

	public int getSize() {
         return privateMethodList.size();
     }

	public void genKra(PW pw) {
  	   for(PrivateMethod pm : privateMethodList) {
		   pm.genKra(pw);
	   }
     }
	
    private ArrayList<PrivateMethod> privateMethodList;

}
