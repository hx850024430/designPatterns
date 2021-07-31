package com.hx.designPatterns.Bridge;

public class Apple implements Brand{
    @Override
    public void open() {
        System.out.println("apple open...");
    }

    @Override
    public void close() {
        System.out.println("apple close....");
    }

    @Override
    public void call() {
        System.out.println("apple calling....");
    }
}
