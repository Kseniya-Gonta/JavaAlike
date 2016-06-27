package com.example.customClass;

/**
 * Created by ksenya on 20.06.16.
 */
public class Parameter {
    Parameter(Class parameterType, String parameterName)
    {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
    }

    public String getParameterName()
    {
        return parameterName;
    }

    public Class getParameterType()
    {
        return parameterType;
    }
    private Class parameterType;
    private String parameterName;
}
