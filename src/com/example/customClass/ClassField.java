package com.example.customClass;

import com.example.classOrInterface.Field;
import com.example.main.CustomModifier;
import com.example.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */

public class ClassField extends Field {

    public ClassField(List<CustomModifier> modifier, String name, String type) {

        super(modifier, name, type);
    }

    public ClassField(CustomModifier modifier, String name, String type) {
        super(modifier, name, type);
    }

    public ClassField(List<CustomModifier> modifier, String name, String type, List<Parameter> parameters) {

        super(modifier, name, type);
        this.parameters = parameters;
    }

    public ClassField(CustomModifier modifier, String name, String type, Parameter parameter) {
        super(modifier, name, type);
        this.parameters.add(parameter);
    }

    public String getType() {

        return type;
    }

    private List<Parameter> parameters = new LinkedList<>();
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}