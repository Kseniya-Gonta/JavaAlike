package com.example.statement;

import com.example.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class BlockStatement implements Statement {
    public void addStatement(Statement a)
    {

        statements.add(a);
    }

    public List<Statement> getStatements()
    {

        return statements;
    }

    public void setStatements(List<Statement> statements)
    {

        this.statements = statements;
    }
    private List<Statement> statements = new LinkedList<Statement>();
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}