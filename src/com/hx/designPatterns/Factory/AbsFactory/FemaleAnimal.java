package com.hx.designPatterns.Factory.AbsFactory;

public abstract class FemaleAnimal {
    private String name;

    public FemaleAnimal(String name) {
        this.name = "female"+name;
    }

    abstract void quack();

    @Override
    public String toString() {
        return "FemaleAnimal{" +
                "name='" + name + '\'' +
                '}';
    }
}
