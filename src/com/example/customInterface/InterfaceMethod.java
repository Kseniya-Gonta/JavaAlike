package com.example.customInterface;

import com.example.classOrInterface.Method;
import com.example.main.Modifier;

import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class InterfaceMethod extends Method {
    InterfaceMethod(List<Modifier> modifier, String name, String type) {
        super(modifier, name, type);
    }
}