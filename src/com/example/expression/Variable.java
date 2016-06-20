package com.example.expression;

import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class Variable implements Expr {
    public Variable(String x)
    {
        this.varname = x;
    }

    public String varname;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}