package com.hx.designPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.quack();
        System.out.println("由于叫的太久了，失声了......所以.....");
        duck.setQuackBehavior(new NoQuack());
        duck.quack();
    }
}
