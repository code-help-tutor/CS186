WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/* Generated By:JJTree: Do not edit this line. ASTExecutableStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTExecutableStatement extends SimpleNode {
  public ASTExecutableStatement(int id) {
    super(id);
  }

  public ASTExecutableStatement(RookieParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f91f259b8d4b7c60ede6e1633cd76257 (do not edit this line) */
