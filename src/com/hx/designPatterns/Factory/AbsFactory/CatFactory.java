package com.hx.designPatterns.Factory.AbsFactory;

public class CatFactory implements AbstractFactory{
    @Override
    public FemaleAnimal createFemaleAnimal() {
        return new FemaleCat("喵喵");
    }

    @Override
    public MaleAnimal createMaleAnimal() {
        return new MaleCat("喵喵");
    }
}
