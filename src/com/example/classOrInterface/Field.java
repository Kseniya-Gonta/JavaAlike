package com.example.classOrInterface;

import com.example.main.Modifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class Field extends Inner {
    public Field(List<Modifier> modifier, String name, String type)
    {
        this.modifier = modifier;
        this.name = name;
        this.type = type;
    }
    public Field(Modifier modifier, String name, String type) {
        this.modifier.add(modifier);
        this.name = name;
        this.type = type;
    }
    public String name;
    public String type;
    public List<Modifier> modifier = new ArrayList<>();
}
