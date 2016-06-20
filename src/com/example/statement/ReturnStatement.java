package com.example.statement;

import com.example.expression.Expr;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class ReturnStatement implements Statement {
    public ReturnStatement(Expr a) {
        this.expression = a;
    }
    public Expr expression;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
