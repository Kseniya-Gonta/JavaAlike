package com.example.customInterface;

import com.example.classOrInterface.ClassOrInterface;
import com.example.main.Modifier;
import com.example.main.Information;
import com.example.visitor.Visitor;

import java.util.List;

/**
 * Created by ksenya on 13.06.16.
 */

public class Interface extends ClassOrInterface {
    public Interface(List<Modifier> modifier, String name, String parent) {
        super(modifier, name, parent);
    }

    public void visit(Visitor visitor, Information information) {
        try {
            visitor.visit(this, information);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<InterfaceField> getFields() {
        return fields;
    }
    public List<InterfaceField> fields;
    public List<InterfaceMethod> metods;
}

