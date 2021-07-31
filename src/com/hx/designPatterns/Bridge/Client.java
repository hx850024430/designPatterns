package com.hx.designPatterns.Bridge;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Apple());
        phone.open();
        phone.call();
        phone.close();
    }
}
