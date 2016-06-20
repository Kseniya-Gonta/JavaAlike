package com.example.statement;

import com.example.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class ForStatement implements Statement {


    public List<Statement> getBody()
    {
        return body;
    }

    public void addStatement(Statement statement)
    {
        body.add(statement);
    }

    public ForControlStatement forControl;
    private List<Statement> body = new LinkedList<>();
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}