package com.hx.designPatterns.Factory.AbsFactory;

public interface AbstractFactory {
    FemaleAnimal createFemaleAnimal();
    MaleAnimal createMaleAnimal();
}
