package com.example.visitor;

import com.example.customClass.Class;
import com.example.customClass.ClassField;
import com.example.customClass.ClassMethod;
import com.example.customInterface.Interface;
import com.example.customInterface.InterfaceField;
import com.example.expression.*;
import com.example.main.Information;
import com.example.statement.ExecuteMethod;
import com.example.statement.*;

import java.util.*;

/**
 * Created by ksenya on 18.06.16.
 */
public class CheckScopes implements Visitor {

    public CheckScopes() {
    }

    public Stack getStack()
    {
        return stack;
    }


    public void visit(Class a, Information information) throws Exception
    {
        this.information = information;
        for (ClassMethod method : a.getMethods())
        {
            stack.addLevel(new HashMap<>());
            method.visit(this);
            stack.removeLevel();
        }
        for (ClassField field : a.getFields())
        {
            stack.addLevel(new HashMap<>());
            field.visit(this);
            stack.removeLevel();
        }

    }
    public void visit(Interface a, Information information) throws Exception {
        for (InterfaceField field : a.getFields())
        {
            stack.addLevel(new HashMap<>());
            field.visit(this);
            stack.removeLevel();
        }
    }

    @Override
    public void visit(ClassField a) throws Exception{
        if (!Objects.equals(a.getType().name, "Int"))
        {
            if (!information.classExist(a.getType().name))
            {
                throw new Exception("Type " + a.getType().name + " not found");
            }
        }
    }

    @Override
    public void visit(InterfaceField a) throws Exception {
        if (!Objects.equals(a.getType().name, "Int"))
        {
            if (!information.classExist(a.getType().name))
            {
                throw new Exception("Type " + a.getType().name + " not found");
            }
        }

    }

    public void visit(ClassMethod a) throws Exception {
        if (!Objects.equals(a.getType().name, "Int"))
        {
            if (!information.classExist(a.getType().name))
            {
                throw new Exception("Type " + a.getType().name + " not found");
            }
        }
        a.getMethodBody().visit(this);
    }

    public void visit(BlockStatement a) throws Exception {
        for(Statement k : a.getStatements())
        {
            k.visit(this);
        }
    }

    public void visit(VariableStatement a) throws Exception {
        if (!Objects.equals(a.getVariableType().name, "Int"))
        {
            if (!information.classExist(a.getVariableType().name))
            {
                throw new Exception("Type " + a.getVariableType() + " not found");
            }
        }
        stack.peekLast().put(a.getVariableId(), a);
    }

    public void visit(AssignStatement a) throws Exception {
        NewVariableDeclaration type = stack.findOnStack(a.left);
        if (Objects.equals(type, null))
        {
            throw new Exception("Variable " + a.left + " not found");
        }
        a.right.visit(this);
    }


    public void visit(ForStatement a) throws Exception {
        a.forControl.visit(this);
        for(Statement k : a.getBody())
        {
            k.visit(this);
        }
        stack.removeLevel();

    }

    public void visit(ForControlStatement a) throws Exception {
        NewVariableDeclaration type = stack.findOnStack(a.getElements().name);
        if (Objects.equals(type, null))
        {
            throw new Exception("Variable " + a.getElements().name + " not found");
        }
        HashMap<String, NewVariableDeclaration> map = new HashMap<>();
        map.put(a.getVariableId(), a);
        stack.addLevel(map);
    }

    public void visit(ReturnStatement a) throws Exception {
        a.expression.visit(this);
    }

    public void visit(IfElseStatement a) throws Exception {
        a.check.visit(this);

        stack.addLevel(new HashMap<>());
        a.first.visit(this);
        stack.removeLevel();
        stack.addLevel(new HashMap<>());
        a.second.visit(this);
        stack.removeLevel();
    }


    public void visit(ExecuteMethod a) throws Exception {

        NewVariableDeclaration type = stack.findOnStack(a.object.varname);
        if (type == null)
        {
            if (!information.classExist(a.object.varname))
            {
                throw new Exception("Variable or class " + a.object.varname + " not found");
            }
            if (information.methodType(a.object.varname, a.method.name) == null)
            {
                throw new Exception("No method called " + a.method.name + " in " +a.object.varname + " class");
            }
        }
    }

    public void visit(ThrowStatement a) throws Exception {
        a.expression.visit(this);
    }

    public void visit(TryCatchStatement a) throws Exception {
        stack.addLevel(new HashMap<>());
        a.tryBlock.visit(this);
        stack.removeLevel();
        stack.addLevel(new HashMap<>());
        a.errorMessege.visit(this);
        a.catchBlock.visit(this);
        stack.removeLevel();
    }

    public void visit(NewExpr a) throws Exception {
        if (!information.classExist(a.className))
        {
            throw new Exception("Variable " + a.className + " not found");
        }
    }
    public void visit(OrExpr a){}
    public void visit(AndExpr a) throws Exception {
        a.first.visit(this);
        a.second.visit(this);
    }
    public void visit(ConditionalExpr a) throws Exception {
        a.first.visit(this);
        a.second.visit(this);
    }
    public void visit(AddExpr a) throws Exception {
        a.first.visit(this);
        a.second.visit(this);
    }
    public void visit(MulExpr a) throws Exception {
        a.first.visit(this);
        a.second.visit(this);
    }


    public void visit(IntLiteral a) {}

    public void visit(Variable a) throws Exception {

        NewVariableDeclaration type = stack.findOnStack(a.varname);
        if (type == null)
        {
                throw new Exception("Variable " + a.varname + " not found");
        }

    }

    @Override
    public void visit(Method a) throws Exception {
        NewVariableDeclaration type = stack.findOnStack(a.object.varname);
        if (type == null)
        {
            throw new Exception("Variable " + a.object.varname + " not found");
        }

        String className = type.getVariableType().name;
        if (!information.classExist(className))
        {
            throw new Exception("Class " + className + " not found");
        }
        if (information.methodType(className, a.method) == null)
        {
            throw new Exception("No method called " + a.method + " in " + className + " class");
        }


    }



    public void visit(GetField a) {}

    private Stack stack = new Stack();

    private Information information;



}