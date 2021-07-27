package com.hx.designPatterns.builder;

public class Director {
    AbstractBuilder abstractBuilder;

    public void setAbstractBuilder(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    public House construct(){
        abstractBuilder.buildHigh();
        abstractBuilder.buildWidth();
        return abstractBuilder.getResult();
    }
}
