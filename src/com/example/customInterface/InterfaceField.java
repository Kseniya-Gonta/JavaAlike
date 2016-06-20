package com.example.customInterface;

import com.example.classOrInterface.Field;
import com.example.customClass.Class;
import com.example.main.Modifier;
import com.example.visitor.Visitor;

import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class InterfaceField extends Field {
    InterfaceField(List<Modifier> modifier, String name, Class type) {
        super(modifier, name, type);
    }

    public Class getType() {

        return type;
    }

    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}