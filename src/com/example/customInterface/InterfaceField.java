package com.example.customInterface;

import com.example.classOrInterface.Field;
import com.example.main.Modifier;
import com.example.visitor.Visitor;

import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class InterfaceField extends Field {
    InterfaceField(List<Modifier> modifier, String name, String type) {
        super(modifier, name, type);
    }

    public String getType() {

        return type;
    }

    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}