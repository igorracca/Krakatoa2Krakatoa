package ast;

import java.util.ArrayList;
import java.util.Iterator;

public class PublicMethodList {

    public PublicMethodList() {
    	publicMethodList = new ArrayList<PublicMethod>();
     }

     public void addElement(PublicMethod pm) {
    	 publicMethodList.add(pm);
     }

     public Iterator<PublicMethod> elements() {
         return publicMethodList.iterator();
     }

     public ArrayList<PublicMethod> getPublicMethod() {
 		return publicMethodList;
 	}

 	public void setParamList(ArrayList<PublicMethod> publicMethodList) {
 		this.publicMethodList = publicMethodList;
 	}

 	public int getSize() {
         return publicMethodList.size();
     }

     public void genKra(PW pw) {
  	   for(PublicMethod pm : publicMethodList) {
		   pm.genKra(pw);
	   }
     }
	
    private ArrayList<PublicMethod> publicMethodList;

}
