package com.hx.designPatterns.Factory.AbsFactory;

public class FemaleCat extends FemaleAnimal{
    public FemaleCat(String name) {
        super(name);
    }

    @Override
    void quack() {
        System.out.println("喵喵喵");
    }
}
