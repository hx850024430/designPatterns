package com.hx.designPatterns.Factory.FactorryMethod;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("汪汪汪");
    }
}
