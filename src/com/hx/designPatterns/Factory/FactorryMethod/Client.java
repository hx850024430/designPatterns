package com.hx.designPatterns.Factory.FactorryMethod;



public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new DogFactory();
        Animal animal = abstractFactory.createAnimal();
        animal.quack();
    }
}
