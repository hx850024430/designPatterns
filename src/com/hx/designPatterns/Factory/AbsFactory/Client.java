package com.hx.designPatterns.Factory.AbsFactory;


public class Client {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        FemaleDog femaleAnimal = dogFactory.createFemaleAnimal();
        femaleAnimal.quack();
        CatFactory catFactory = new CatFactory();
        MaleAnimal maleAnimal = catFactory.createMaleAnimal();
        maleAnimal.quack();
        System.out.println(femaleAnimal.toString());
        System.out.println(maleAnimal.toString());
    }
}
