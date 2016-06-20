package com.example.visitor;

import com.example.customClass.Class;
import com.example.customClass.ClassField;
import com.example.customClass.ClassMethod;
import com.example.customInterface.Interface;
import com.example.customInterface.InterfaceField;
import com.example.expression.*;
import com.example.main.Modifier;
import com.example.main.Information;
import com.example.statement.*;

/**
 * Created by ksenya on 20.06.16.
 */
public class ErrorsChecker implements Visitor {
    @Override
    public Stack getStack() {
        return null;
    }

    @Override
    public void visit(ClassMethod a) throws Exception {

    }

    @Override
    public void visit(Class a, Information information) throws Exception {
        boolean hasAbstractMethod = false;
        for(ClassMethod method:a.getMethods())
        {
            hasAbstractMethod = method.getModifiers().contains(Modifier.ABSTRACT);
        }
        if (!a.getModifiers().contains(Modifier.ABSTRACT) && hasAbstractMethod)
        {
            throw new Exception("Class " + a.name + " has abstract method and should be abstract");
        }
    }

    @Override
    public void visit(Interface a, Information information) throws Exception {

    }

    @Override
    public void visit(ReturnStatement a) throws Exception {

    }

    @Override
    public void visit(BlockStatement a) throws Exception {

    }

    @Override
    public void visit(ThrowStatement a) throws Exception {

    }

    @Override
    public void visit(ForControlStatement a) throws Exception {

    }

    @Override
    public void visit(ForStatement a) throws Exception {

    }

    @Override
    public void visit(IfElseStatement a) throws Exception {

    }

    @Override
    public void visit(NewExpr a) throws Exception {

    }

    @Override
    public void visit(AssignStatement a) throws Exception {

    }

    @Override
    public void visit(TryCatchStatement a) throws Exception {

    }

    @Override
    public void visit(VariableStatement a) throws Exception {

    }

    @Override
    public void visit(ExecuteMethod a) throws Exception {

    }

    @Override
    public void visit(GetField a) {

    }

    @Override
    public void visit(OrExpr a) {

    }

    @Override
    public void visit(AndExpr a) throws Exception {

    }

    @Override
    public void visit(ConditionalExpr a) throws Exception {

    }

    @Override
    public void visit(AddExpr a) throws Exception {

    }

    @Override
    public void visit(MulExpr a) throws Exception {

    }

    @Override
    public void visit(IntLiteral a) {

    }

    @Override
    public void visit(Variable a) throws Exception {

    }

    @Override
    public void visit(Method method) {

    }

    @Override
    public void visit(ClassField a) throws Exception {

    }

    @Override
    public void visit(InterfaceField a) throws Exception {

    }
}
