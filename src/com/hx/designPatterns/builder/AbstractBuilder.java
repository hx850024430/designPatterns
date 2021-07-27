package com.hx.designPatterns.builder;

public abstract class AbstractBuilder {
    protected House house = new House();
    abstract void buildHigh();
    abstract void buildWidth();
    public House getResult(){
        return house;
    }
}
