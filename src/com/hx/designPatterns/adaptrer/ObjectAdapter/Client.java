package com.hx.designPatterns.adaptrer.ObjectAdapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        target.charge(new Adapter(new Adaptee()));
    }
}
