package com.hx.designPatterns.Factory.FactorryMethod;

public class CatFactory implements AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Cat("咪咪");
    }
}
