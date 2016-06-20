package com.example.customInterface;

import com.example.classOrInterface.Method;
import com.example.main.CustomModifier;

import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class InterfaceMethod extends Method {
    InterfaceMethod(List<CustomModifier> modifier, String name, String type) {
        super(modifier, name, type);
    }
}