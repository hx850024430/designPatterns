package com.hx.designPatterns.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    public int interpreter(HashMap<String, Integer> var) {
        return (Integer)var.get(this.key);
    }
}
