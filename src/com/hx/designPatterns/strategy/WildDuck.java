package com.hx.designPatterns.strategy;

public class WildDuck extends Duck{
    public WildDuck() {
        quackBehavior = new LoudQuack();
    }
}
