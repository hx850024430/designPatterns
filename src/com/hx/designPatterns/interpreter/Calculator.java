package com.hx.designPatterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack();
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        for(int i = 0; i < charArray.length; ++i) {
            switch(charArray[i]) {
                case '+':
                    left = (Expression)stack.pop();
                    ++i;
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case ',':
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
                case '-':
                    left = (Expression)stack.pop();
                    ++i;
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new SubExpression(left, right));
            }
        }

        this.expression = (Expression)stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
