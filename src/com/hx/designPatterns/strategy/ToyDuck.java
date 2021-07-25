package com.hx.designPatterns.strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        quackBehavior = new NoQuack();
    }
}
