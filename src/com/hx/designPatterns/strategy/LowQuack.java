package com.hx.designPatterns.strategy;

public class LowQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("小声的嘎嘎嘎叫");
    }
}
