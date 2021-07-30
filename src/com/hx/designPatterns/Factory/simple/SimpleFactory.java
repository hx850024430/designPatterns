package com.hx.designPatterns.Factory.simple;

public class SimpleFactory {
    public Animal getAnimal(String name){
        if ("Dog".equals(name)){
            return new Dog("dog");
        }else if ("Cat".equals(name)){
            return new Cat("cat");
        }else {
            return new Pig("pig");
        }
    }
}
