package com.hx.designPatterns.Factory.simple;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void quack();
}
