package com.example.statement;

import com.example.customClass.ClassMethod;
import com.example.expression.Expr;
import com.example.expression.Variable;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class ExecuteMethod implements Statement, Expr {
    public ExecuteMethod(Variable object, ClassMethod method)
    {
        this.object = object;
        this.method = method;
    }
    public Variable object;
    public ClassMethod method;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
