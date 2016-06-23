package com.example.expression;

import com.example.customClass.ClassMethod;
import com.example.statement.Statement;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class Method implements Expr {
    public Method(Variable object, String method)
    {
        this.object = object;
        this.method = method;
    }
    public Variable object;
    public String method;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
