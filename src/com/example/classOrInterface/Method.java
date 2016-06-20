package com.example.classOrInterface;

import com.example.main.CustomModifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class Method extends Inner {
    public Method(List<CustomModifier> modifiers, String name, String type)
    {
        this.modifier = new ArrayList<>(modifiers);
        this.name = name;
        this.type = type;
    }

    public Method(CustomModifier modifier, String name, String type) {
        this.modifier.add(modifier);
        this.name = name;
        this.type = type;
    }
    public String name;
    public String type;
    public List<CustomModifier> modifier =  new ArrayList<>();
}