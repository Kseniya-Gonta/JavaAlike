package com.example.statement;

import com.example.expression.Expr;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class ThrowStatement implements Statement {
    public Expr expression;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}