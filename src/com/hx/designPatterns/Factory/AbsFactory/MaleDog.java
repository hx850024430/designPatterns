package com.hx.designPatterns.Factory.AbsFactory;

public class MaleDog extends MaleAnimal {
    private String name;

    public MaleDog(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("汪汪汪");
    }
}
