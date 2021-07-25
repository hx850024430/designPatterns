package com.hx.designPatterns.interpreter;

import java.util.HashMap;

public abstract class Expression {
    public Expression() {
    }

    public abstract int interpreter(HashMap<String, Integer> var1);
}
