WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/* Generated By:JJTree: Do not edit this line. ASTCommitStatement.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package edu.berkeley.cs186.database.cli.parser;

public
class ASTCommitStatement extends SimpleNode {
  public ASTCommitStatement(int id) {
    super(id);
  }

  public ASTCommitStatement(RookieParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public void jjtAccept(RookieParserVisitor visitor, Object data) {
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9a7c3850be4ca2fd01aa7dc136747930 (do not edit this line) */
