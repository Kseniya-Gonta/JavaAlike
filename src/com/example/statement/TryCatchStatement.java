package com.example.statement;

import com.example.expression.Variable;
import com.example.visitor.Visitor;

/**
 * Created by ksenya on 18.06.16.
 */
public class TryCatchStatement implements Statement {
    public BlockStatement tryBlock;
    public BlockStatement catchBlock;
    public Variable errorMessege;
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}