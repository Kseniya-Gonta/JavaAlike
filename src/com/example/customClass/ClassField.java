package com.example.customClass;

import com.example.classOrInterface.Field;
import com.example.main.Modifier;
import com.example.statement.NewVariableDeclaration;
import com.example.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */

public class ClassField extends Field implements NewVariableDeclaration{

    public ClassField(List<Modifier> modifier, String name, Class type) {

        super(modifier, name, type);
    }

    public ClassField(Modifier modifier, String name, Class type) {
        super(modifier, name, type);
    }



    public Class getType() {

        return type;
    }

    public String getVariableId() {
        return name;
    }

    public Class getVariableType() {
        return type;
    }

    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}