WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package edu.berkeley.cs186.database.cli.visitor;

/**
 * Purely symbolic class
 */
public class BeginStatementVisitor extends StatementVisitor {
    public StatementType getType() {
        return StatementType.BEGIN;
    }
}