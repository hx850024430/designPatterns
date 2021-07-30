package com.hx.designPatterns.Factory.simple;

public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Animal dog = simpleFactory.getAnimal("Dog");
        dog.quack();
    }
}
