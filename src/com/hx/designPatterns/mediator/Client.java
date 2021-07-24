package com.hx.designPatterns.mediator;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        TV tv = new TV(concreteMediator, "TV");
        Curtain curtain = new Curtain(concreteMediator, "Curtain");
        tv.sentMessage(1);
//        curtain.sentMessage(0);
    }
}
