package com.example.classOrInterface;

import com.example.main.Modifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class Method extends Inner {
    public Method(List<Modifier> modifiers, String name, String type)
    {
        this.modifier = new ArrayList<>(modifiers);
        this.name = name;
        this.type = type;
    }

    public Method(Modifier modifier, String name, String type) {
        this.modifier.add(modifier);
        this.name = name;
        this.type = type;
    }
    public String name;
    public String type;
    public List<Modifier> modifier =  new ArrayList<>();
}