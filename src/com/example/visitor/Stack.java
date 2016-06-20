package com.example.visitor;

import com.example.statement.NewVariableDeclaration;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksenya on 20.06.16.
 */
public class Stack {


    public void addLevel(HashMap<String, NewVariableDeclaration> map)
    {
        stack.add(map);
        index++;
    }

    public void removeLevel()
    {
        stack.remove(index);
        index--;
    }

    public HashMap<String, NewVariableDeclaration> peekLevel(int index)
    {
        return stack.get(index);
    }

    public HashMap<String, NewVariableDeclaration> peekLast()
    {
        return stack.get(index);
    }

    public NewVariableDeclaration findOnStack(String variable){
        for (int pointer = index; pointer >= 0; pointer--)
        {
            if (peekLevel(pointer).containsKey(variable))
            {
                return peekLevel(pointer).get(variable);
            }
        }
        return null;
    }

    private List<HashMap<String, NewVariableDeclaration>> stack = new LinkedList<>();
    private int index = -1;
}
