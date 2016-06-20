package com.example.customClass;

/**
 * Created by ksenya on 20.06.16.
 */
public class Parameter {
    Parameter(String parameterType, String parameterName)
    {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
    }

    public String getParameterName()
    {
        return parameterName;
    }

    public String getParameterType()
    {
        return parameterType;
    }
    private String parameterType;
    private String parameterName;
}
