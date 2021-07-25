package com.hx.designPatterns.interpreter;

import java.util.HashMap;

public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
