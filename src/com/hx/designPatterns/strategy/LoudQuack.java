package com.hx.designPatterns.strategy;

public class LoudQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("非常大声的鸭子叫！！！");
    }
}
