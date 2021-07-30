package com.hx.designPatterns.Factory.FactorryMethod;

public class DogFactory implements AbstractFactory{
    @Override
    public Animal createAnimal() {
        return new Dog("汪汪");
    }
}
