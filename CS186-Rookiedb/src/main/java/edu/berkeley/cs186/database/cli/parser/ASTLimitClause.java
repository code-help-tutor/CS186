WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/* Generated By:JJTree: Do not edit this line. ASTLimitClause.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTLimitClause extends SimpleNode {
  public ASTLimitClause(int id) {
    super(id);
  }

  public ASTLimitClause(RookieParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7f8bc36845102608b7a5217da42ec88a (do not edit this line) */