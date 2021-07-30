package com.hx.designPatterns.Factory.FactorryMethod;

public class PigFactory implements AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Pig("哼哼");
    }
}
