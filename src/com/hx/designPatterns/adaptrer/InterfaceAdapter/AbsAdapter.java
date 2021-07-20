package com.hx.designPatterns.adaptrer.InterfaceAdapter;

public abstract class AbsAdapter implements ICharge{
    @Override
    public int charge5V() {
        return 0;
    }

    @Override
    public int charge110V() {
        return 0;
    }

    @Override
    public int charge220V() {
        return 0;
    }

    @Override
    public int charge360V() {
        return 0;
    }
}
