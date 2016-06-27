package com.example.customClass;

import com.example.classOrInterface.Method;
import com.example.main.Modifier;
import com.example.statement.NewVariableDeclaration;
import com.example.visitor.Visitor;
import com.example.statement.BlockStatement;
import com.example.statement.Statement;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class ClassMethod extends Method implements NewVariableDeclaration {
    public ClassMethod(List<Modifier> modifier, String name, Class type) {

        super(modifier, name, type);
    }

    public ClassMethod(Modifier modifier, String name, Class type) {

        super(modifier, name, type);
    }

    public ClassMethod(List<Modifier> modifier, String name, Class type, List<Parameter> parameters) {

        super(modifier, name, type);
        this.parameters = parameters;
    }

    public ClassMethod(Modifier modifier, String name, Class type, Parameter parameter) {
        super(modifier, name, type);
        this.parameters.add(parameter);
    }




    public BlockStatement getMethodBody() {

        return methodBody;
    }

    public void addMethodBody(Statement methodBody) {

        this.methodBody.addStatement(methodBody);
    }
    public void setMethodBody(BlockStatement methodBody) {

        this.methodBody.addStatement(methodBody);
    }

    public Class getType() {

        return type;
    }

    public List<Modifier> getModifiers()
    {
        return modifier;
    }

    public List<Parameter> getParameters()
    {
        return parameters;
    }


    public String getVariableId() {
        return name;
    }

    public Class getVariableType() {
        return type;
    }



    private List<Parameter> parameters = new LinkedList<>();
    private BlockStatement methodBody = new BlockStatement();
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
