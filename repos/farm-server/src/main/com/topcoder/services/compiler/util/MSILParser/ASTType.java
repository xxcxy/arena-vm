/* Generated By:JJTree: Do not edit this line. ASTType.java */

package com.topcoder.services.compiler.util.MSILParser;

public class ASTType extends SimpleNode {
  public ASTType(int id) {
    super(id);
  }

  public ASTType(MSILParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MSILParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
    public String getType() {
      for(int i =0  ; i < children.length; i++) {
          if(children[i] instanceof ASTTypeBase) {
                return ((ASTTypeBase)children[i]).getType();
          }
      }
      
      return null;
  }
}