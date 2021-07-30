package com.hx.designPatterns.Factory.simple;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("喵喵喵");
    }
}
