package com.hx.designPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        teaMaker.makeTea();
    }
}
