package com.hx.designPatterns.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(3);
        for (int i = 0; i < 15; i++) {
            context.deduceMoney();
            context.doLottery();
            System.out.println("----------------");
        }
    }
}
