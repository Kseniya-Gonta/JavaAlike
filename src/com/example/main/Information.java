package com.example.main;

import com.example.customClass.Class;
import com.example.program.Member;
import com.sun.tools.javac.util.Pair;

import java.util.HashMap;

/**
 * Created by ksenya on 19.06.16.
 */
public class Information {
    public boolean classExist(String classname)
    {

        return information.containsKey(classname);
    }

    public Class fieldType(String classname, String fieldname)
    {
        if (classExist(classname))
        {
            HashMap<Pair<String, Member>, Class> methodInner = information.get(classname);
            if (methodInner.containsKey(new Pair<>(fieldname, Member.FIELD)))
            {
                return methodInner.get(new Pair<>(fieldname, Member.FIELD));
            }
        }
        return null;
    }

    public Class methodType(String classname, String methodname)
    {
        if (classExist(classname))
        {
            HashMap<Pair<String, Member>, Class> methodInner = information.get(classname);
            if (methodInner.containsKey(new Pair<>(methodname, Member.FIELD)))
            {
                return methodInner.get(new Pair<>(methodname, Member.FIELD));
            }
        }
        return null;
    }

    public void addInformation(String name, HashMap<Pair<String, Member>, Class> inf)
    {
        information.put(name, inf);
    }
    private HashMap<String,HashMap<Pair<String, Member>, Class>> information = new HashMap<>();
}
