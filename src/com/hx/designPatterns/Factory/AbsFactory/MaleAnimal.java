package com.hx.designPatterns.Factory.AbsFactory;

public abstract class MaleAnimal {
    private String name;

    public MaleAnimal(String name) {
        this.name = "male"+name;
    }

    abstract void quack();


    @Override
    public String toString() {
        return "MaleAnimal{" +
                "name='" + name + '\'' +
                '}';
    }
}
