package com.example.customClass;
//import java.util.List;


import com.example.classOrInterface.ClassOrInterface;
import com.example.main.CustomModifier;
import com.example.main.Information;
import com.example.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Class extends ClassOrInterface {

    public Class(CustomModifier modifier, String name, String parent) {

        super(new ArrayList<CustomModifier>(), name, parent);
    }

    public void visit(Visitor visitor, Information information) {
        try {
            visitor.visit(this, information);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addMethods(Collection<ClassMethod> methods) {

        this.methods.addAll(methods);
    }

    public void addMethod(ClassMethod method) {

        this.methods.add(method);
    }

    public List<ClassMethod> getMethods() {
        return methods;
    }

    public List<ClassField> getFields() {
        return fields;
    }

    public void addFieldss(Collection<ClassField> fields) {

        this.fields.addAll(fields);
    }

    public void addField(ClassField field) {

        this.fields.add(field);
    }


    public List<ClassField> fields = new ArrayList<>();
    public List<ClassMethod> methods = new ArrayList<>();
    public List<Class> classes = new ArrayList<>();
}
