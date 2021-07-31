package com.hx.designPatterns.Bridge;

public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
