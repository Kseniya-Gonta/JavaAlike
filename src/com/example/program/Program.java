package com.example.program;

import com.example.classOrInterface.ClassOrInterface;
import com.example.customClass.Class;
import com.example.customClass.ClassField;
import com.example.customClass.ClassMethod;
import com.example.main.Information;
import com.example.visitor.CheckScopes;
import com.example.visitor.Visitor;
import com.sun.tools.javac.util.Pair;

import java.util.*;

public class Program {
    public void addClass(Class newClass)
    {
        program.add(newClass);

        HashMap<Pair<String, Member>, String> map = new HashMap<>();
        for(ClassField field: newClass.fields) {
            map.put(new Pair(field.name, Member.FIELD), field.type);
        }
        for(ClassMethod method: newClass.methods) {
            map.put(new Pair(method.name, Member.METHOD), method.type);
        }
        information.addInformation(newClass.name, map);
    }



    public void checkCorrectness()
    {
        Visitor myVisitor = new CheckScopes();
        for(ClassOrInterface classOrInterfaces : program)
        {
            try {
                classOrInterfaces.visit(myVisitor, information);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<ClassOrInterface> getProgram()
    {
        return program;
    }
    private List<ClassOrInterface> program = new LinkedList<>();

    private Information information = new Information();

}
