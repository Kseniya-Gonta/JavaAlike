package com.example.statement;

import com.example.customClass.Class;
import com.example.expression.Expr;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class VariableStatement implements Statement, NewVariableDeclaration {
    public VariableStatement(String name, Expr expression, Class variableType)
    {
        this.variableId = name;
        this.variableType = variableType;
        this.expression = expression;
    }

    public Class getVariableType()
    {
        return variableType;
    }
    public String getVariableId()
    {
        return variableId;
    }

    private Class variableType;
    private String variableId;
    public Expr expression;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}