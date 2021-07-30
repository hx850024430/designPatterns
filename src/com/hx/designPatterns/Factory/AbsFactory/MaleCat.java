package com.hx.designPatterns.Factory.AbsFactory;

public class MaleCat extends MaleAnimal {
    public MaleCat(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("喵喵喵");
    }
}
