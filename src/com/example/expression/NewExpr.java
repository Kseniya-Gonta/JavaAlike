package com.example.expression;

import com.example.statement.Statement;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class NewExpr implements Expr {
    public NewExpr(String name)
    {
        this.className = name;
    }
    public String className;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
