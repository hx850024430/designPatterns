package com.hx.designPatterns.decorator;

public class Decorator extends Drink{
    private Drink obj;
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDesc() {
        return desc +" " + getPrice() + "&&" + obj.getDesc();
    }
}
