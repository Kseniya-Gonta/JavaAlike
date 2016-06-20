package com.example.expression;

import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class GetField implements Expr {
    public void visit(Visitor visitor) { visitor.visit(this); }
}
