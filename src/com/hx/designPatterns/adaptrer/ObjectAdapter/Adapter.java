package com.hx.designPatterns.adaptrer.ObjectAdapter;

public class Adapter  implements ICharge {
    Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int charge5V() {
        int voltage = adaptee.charge220V();
        voltage /= 44;
        return voltage;
    }
}
