package ast;

import java.util.ArrayList;

/*
 * Krakatoa Class
 */
public class KraClass extends Type {
	
   public KraClass( String name ) {
      super(name);
   }
   
   public String getCname() {
      return name;
   }
   
   public void setInstanceVariableList(InstanceVariableList instanceVariableList) {
	   this.instanceVariableList = instanceVariableList;
   }
   
   public void setPublicMethodList(PublicMethodList publicMethodList) {
	   this.publicMethodList = publicMethodList;
   }
  
   public void setPrivateMethodList(PrivateMethodList privateMethodList) {
	   this.privateMethodList = privateMethodList;
   }
   
   public void genKra(PW pw) {
	   pw.printlnIdent("Class " + super.getName() + " {");
	   pw.add();
	   instanceVariableList.genKra(pw);
	   publicMethodList.genKra(pw);
//	   privateMethodList.genKra(pw);
	   pw.sub();
	   pw.printlnIdent("}");
   }
   
   private String name=super.getName();
   private KraClass superclass;
   private InstanceVariableList instanceVariableList = new InstanceVariableList();
   private PublicMethodList publicMethodList = new PublicMethodList();
   private PrivateMethodList privateMethodList = new PrivateMethodList();
//   private MethodList publicMethodList, privateMethodList;
   // métodos públicos get e set para obter e iniciar as variáveis acima,
   // entre outros métodos

}
