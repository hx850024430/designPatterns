package com.hx.designPatterns.Factory.FactorryMethod;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("喵喵喵");
    }
}
