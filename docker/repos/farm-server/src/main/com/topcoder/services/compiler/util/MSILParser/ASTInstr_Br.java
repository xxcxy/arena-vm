/* Generated By:JJTree: Do not edit this line. ASTInstr_Br.java */

package com.topcoder.services.compiler.util.MSILParser;

public class ASTInstr_Br extends SimpleNode {
  public ASTInstr_Br(int id) {
    super(id);
  }

  public ASTInstr_Br(MSILParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MSILParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}