package com.hx.designPatterns.strategy;

public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("这只鸭子不会叫");
    }
}
