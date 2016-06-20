package com.example.statement;

import com.example.expression.Expr;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class AssignStatement implements Statement {
    public AssignStatement(String left, Expr right)
    {
        this.left = left;
        this.right = right;
    }
    public String left;
    public Expr right;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}