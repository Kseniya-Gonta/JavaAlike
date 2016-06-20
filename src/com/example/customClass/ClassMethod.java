package com.example.customClass;

import com.example.classOrInterface.Method;
import com.example.main.CustomModifier;
import com.example.visitor.Visitor;
import com.example.statement.BlockStatement;
import com.example.statement.Statement;

import java.util.List;

/**
 * Created by ksenya on 18.06.16.
 */
public class ClassMethod extends Method {
    public ClassMethod(List<CustomModifier> modifier, String name, String type) {

        super(modifier, name, type);
    }

    public ClassMethod(CustomModifier modifier, String name, String type) {

        super(modifier, name, type);
    }

    public BlockStatement getMethodBody() {

        return methodBody;
    }

    public void addMethodBody(Statement methodBody) {

        this.methodBody.addStatement(methodBody);
    }
    public void setMethodBody(BlockStatement methodBody) {

        this.methodBody.addStatement(methodBody);
    }

    public String getType() {

        return type;
    }

    private BlockStatement methodBody = new BlockStatement();
    public void visit(Visitor visitor) throws Exception { visitor.visit(this); }
}
