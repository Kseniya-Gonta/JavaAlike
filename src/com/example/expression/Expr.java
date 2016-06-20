package com.example.expression;


import com.example.visitor.Visitor;

/**
 * Created by ksenya on 12.06.16.
 */

public interface Expr {
    void visit(Visitor visitor) throws Exception;
}
