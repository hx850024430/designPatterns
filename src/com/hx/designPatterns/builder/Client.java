package com.hx.designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.setAbstractBuilder(new HighHouseBuilder());
        System.out.println(director.construct());
        director.setAbstractBuilder(new LowHouseBuilder());
        System.out.println(director.construct());
    }
}
