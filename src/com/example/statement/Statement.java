package com.example.statement;

import com.example.visitor.Visitor;


public interface Statement {
    void visit(Visitor visitor) throws Exception;
}
