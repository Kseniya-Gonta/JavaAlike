package com.example.statement;

import com.example.expression.Expr;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class VariableStatement implements Statement, NewVariableDeclaration {
    public VariableStatement(String name, Expr expression, String variableType)
    {
        this.variableId = name;
        this.variableType = variableType;
        this.expression = expression;
    }

    public String getVariableType()
    {
        return variableType;
    }
    public String getVariableId()
    {
        return variableId;
    }

    private String variableType;
    private String variableId;
    public Expr expression;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}