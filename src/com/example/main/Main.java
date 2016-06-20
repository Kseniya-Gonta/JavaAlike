package com.example.main;


import com.example.customClass.*;
import com.example.customClass.Class;
import com.example.expression.IntLiteral;
import com.example.expression.Variable;
import com.example.program.Program;
import com.example.statement.*;

/**
 * Created by ksenya on 10.06.16.
 */
public class Main {
    public static void main(String[] args) {

        BlockStatement b = new BlockStatement();
        b.addStatement(new VariableStatement("x", new IntLiteral(6), "Int"));
        b.addStatement(new VariableStatement("z", new IntLiteral(15), "Int"));
        b.addStatement(new AssignStatement("x", new Variable("z")));
        //b.addStatement(new AssignStatement("y", new IntLiteral(10)));
        //b.addStatement((new AssignStatement("y",new OrExpr(new Variable("x"), new Variable("y")))));

        Class a = new Class(CustomModifier.Public, "MyClass", "parent");
        a.addMethod(new ClassMethod(CustomModifier.Public, "MyMethod", "Int"));
        //a.methods.get(0).addMethodBody(new ReturnStatement(new IntLiteral(10)));
        a.methods.get(0).addMethodBody(new VariableStatement("x", new IntLiteral(6), "Int"));
        a.methods.get(0).addMethodBody(new VariableStatement("z", new IntLiteral(6), "Int"));
        //a.methods.get(0).addMethodBody(new AssignStatement("z", new Variable("z")));

        Class second = new Class(CustomModifier.Public, "SecondClass", "parent");
        second.addMethod(new ClassMethod(CustomModifier.Public, "SecondMethod", "Int"));
        second.addMethod(new ClassMethod(CustomModifier.Public, "ThirdMethod", "Int"));
        a.methods.get(0).addMethodBody(new ReturnStatement(new IntLiteral(10)));
        second.methods.get(0).addMethodBody(new VariableStatement("second", new IntLiteral(6), "MyClass"));
        second.methods.get(1).addMethodBody(b);

        Class third = new Class(CustomModifier.Public, "A", "");
        third.addField(new ClassField(CustomModifier.Public, "c", "Int"));
        third.addField(new ClassField(CustomModifier.Public, "b", "B"));


        Class fourth = new Class(CustomModifier.Public, "B", "");
        third.addField(new ClassField(CustomModifier.Public, "a", "A"));

        Program newprogram = new Program();
        newprogram.addClass(a);
        newprogram.addClass(second);
        newprogram.addClass(third);
        newprogram.addClass(fourth);
        newprogram.checkCorrectness();

    }
}

