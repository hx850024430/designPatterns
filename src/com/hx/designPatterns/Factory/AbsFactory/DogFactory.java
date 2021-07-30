package com.hx.designPatterns.Factory.AbsFactory;

public class DogFactory implements AbstractFactory{
    @Override
    public FemaleDog createFemaleAnimal() {
        System.out.println("creating female dog......");
        return new FemaleDog("旺财");
    }

    @Override
    public MaleAnimal createMaleAnimal() {
        return new MaleDog("旺财");
    }


}
