package com.hx.designPatterns.strategy;

public class VegetableDuck extends Duck{
    public VegetableDuck() {
        quackBehavior = new LowQuack();
    }

}
