package com.example.expression;

import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class MulExpr implements Expr {
    public MulExpr(Expr first, Expr second)
    {
        this.first = first;
        this.second = second;
    }
    public Expr first;
    public Expr second;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
