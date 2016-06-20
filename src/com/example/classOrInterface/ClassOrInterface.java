package com.example.classOrInterface;

import com.example.main.Modifier;
import com.example.main.Information;
import com.example.visitor.Visitor;

import java.util.List;

/**
 * Created by ksenya on 14.06.16.
 */


public  abstract  class ClassOrInterface {
    public ClassOrInterface(List<Modifier> modifier, String name, String parent)
    {
        this.parent = parent;
        this.name = name;
        this.modifier = modifier;
    }

    public String parent;
    public String name;
    public List<Modifier> modifier;

    public abstract void visit(Visitor visitor, Information information);
}
