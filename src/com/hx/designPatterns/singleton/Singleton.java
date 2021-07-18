package com.hx.designPatterns.singleton;

public class Singleton {
    public static final Singleton single = new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return single;
    }

    public static void main(String[] args) {
        new Singleton();
    }
}
