package com.example.statement;

import com.example.customClass.Class;
import com.example.main.CustomCollection;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class ForControlStatement implements Statement, NewVariableDeclaration {

    public ForControlStatement(Class type, String variable, CustomCollection Elements)
    {
        this.variableType = type;
        this.variableId = variable;
        this.Elements = Elements;
    }

    public Class getVariableType()
    {
        return variableType;
    }

    public String getVariableId()
    {
        return variableId;
    }

    public CustomCollection getElements()
    {
        return Elements;
    }



    private Class variableType;
    private String variableId;
    private CustomCollection Elements;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}