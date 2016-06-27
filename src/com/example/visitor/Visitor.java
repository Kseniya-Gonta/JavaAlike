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

/**
 * Created by ksenya on 14.06.16.
 */

public interface Visitor {
    public Stack getStack();
    public void visit(ClassMethod a) throws Exception;
    public void visit(Class a, Information information) throws Exception;
    public void visit(Interface a, Information information) throws Exception;
    public void visit(ReturnStatement a) throws Exception;
    public void visit(BlockStatement a) throws Exception;
    public void visit(ThrowStatement a) throws Exception;
    public void visit(ForControlStatement a) throws Exception;
    public void visit(ForStatement a) throws Exception;
    public void visit(IfElseStatement a) throws Exception;
    public void visit(NewExpr a) throws Exception;
    public void visit(AssignStatement a) throws Exception;
    public void visit(TryCatchStatement a) throws Exception;
    public void visit(VariableStatement a) throws Exception;
    public void visit(ExecuteMethod a) throws Exception;
    public void visit(GetField a);

    public void visit(OrExpr a);
    public void visit(AndExpr a) throws Exception;
    public void visit(ConditionalExpr a) throws Exception;
    public void visit(AddExpr a) throws Exception;
    public void visit(MulExpr a) throws Exception;
    public void visit(IntLiteral a);
    public void visit(Variable a) throws Exception;


    void visit(ClassField a) throws Exception;

    void visit(InterfaceField a) throws Exception;
}

