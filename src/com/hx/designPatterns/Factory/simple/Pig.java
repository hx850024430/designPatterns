package com.hx.designPatterns.Factory.simple;

public class Pig extends Animal{
    public Pig(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("哼哼哼");
    }
}
