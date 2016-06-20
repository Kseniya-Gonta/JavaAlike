package com.example.expression;

import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class IntLiteral implements Expr {
    public IntLiteral(Integer x)
    {
        this.literal = x;
    }
    public Integer literal;
    public void visit(Visitor visitor) { visitor.visit(this); }
}