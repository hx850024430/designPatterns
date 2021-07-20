package com.hx.designPatterns.adaptrer.ClassAdapter;

public class Adapter extends Adaptee implements ICharge{
    @Override
    public int charge5V() {
        int voltage = charge220V();
        voltage /= 44;
        return voltage;
    }
}
