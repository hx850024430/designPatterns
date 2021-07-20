package com.hx.designPatterns.adaptrer.ClassAdapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        ICharge charge = new Adapter();
        target.charge(charge);
    }
}
