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
        b.addStatement(new VariableStatement("x", new IntLiteral(6), new Class(Modifier.PUBLIC, "Int", "")));
        b.addStatement(new VariableStatement("z", new IntLiteral(15), new Class(Modifier.PUBLIC, "Int", "")));
        b.addStatement(new AssignStatement("x", new Variable("z")));
        //b.addStatement(new AssignStatement("y", new IntLiteral(10)));
        //b.addStatement((new AssignStatement("y",new OrExpr(new Variable("x"), new Variable("y")))));

        Class a = new Class(Modifier.PUBLIC, "MyClass", "parent");
        a.addMethod(new ClassMethod(Modifier.PUBLIC, "MyMethod", new Class(Modifier.PUBLIC, "Int", "")));
        //a.methods.get(0).addMethodBody(new ReturnStatement(new IntLiteral(10)));
        a.methods.get(0).addMethodBody(new VariableStatement("x", new IntLiteral(6), new Class(Modifier.PUBLIC, "Int", "")));
        a.methods.get(0).addMethodBody(new VariableStatement("z", new IntLiteral(6), new Class(Modifier.PUBLIC, "Int", "")));
        //a.methods.get(0).addMethodBody(new AssignStatement("z", new Variable("z")));

        Class second = new Class(Modifier.PUBLIC, "SecondClass", "parent");
        second.addMethod(new ClassMethod(Modifier.PUBLIC, "SecondMethod", new Class(Modifier.PUBLIC, "Int", "")));
        second.addMethod(new ClassMethod(Modifier.PUBLIC, "ThirdMethod", new Class(Modifier.PUBLIC, "Int", "")));
        a.methods.get(0).addMethodBody(new ReturnStatement(new IntLiteral(10)));
        second.methods.get(0).addMethodBody(new VariableStatement("second", new IntLiteral(6), new Class(Modifier.PUBLIC, "MyClass", "")));
        second.methods.get(1).addMethodBody(b);

        Class third = new Class(Modifier.PUBLIC, "A", "");
        third.addField(new ClassField(Modifier.PUBLIC, "c", new Class(Modifier.PUBLIC, "Int", "")));
        third.addField(new ClassField(Modifier.PUBLIC, "b", new Class(Modifier.PUBLIC, "B", "")));


        Class fourth = new Class(Modifier.PUBLIC, "B", "");
        third.addField(new ClassField(Modifier.PUBLIC, "a", new Class(Modifier.PUBLIC, "A", "")));

        Program newprogram = new Program();
        newprogram.addClass(a);
        newprogram.addClass(second);
        newprogram.addClass(third);
        newprogram.addClass(fourth);
        newprogram.checkCorrectness();

    }
}

