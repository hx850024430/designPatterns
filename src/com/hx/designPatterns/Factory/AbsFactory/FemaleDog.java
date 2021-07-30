package com.hx.designPatterns.Factory.AbsFactory;

public class FemaleDog extends FemaleAnimal{
    private String name;

    public FemaleDog(String name) {
        super(name);
    }

    public void quack(){
        System.out.println("汪汪汪");
    }
}
