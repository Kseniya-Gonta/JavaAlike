package com.example.customClass;

import com.example.statement.NewVariableDeclaration;

/**
 * Created by ksenya on 20.06.16.
 */
public class Parameter implements NewVariableDeclaration{
    Parameter(Class parameterType, String parameterName)
    {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
    }
    public Class getParameterType()
    {
        return parameterType;
    }

    public String getVariableId() {
        return parameterName;
    }

    public Class getVariableType() {
        return parameterType;
    }

    private Class parameterType;
    private String parameterName;
}
