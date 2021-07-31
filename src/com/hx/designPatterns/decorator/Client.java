package com.hx.designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Drink drink = new LongBlack();
        drink = new Milk(drink);
        drink = new Soy(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDesc());

    }
}
