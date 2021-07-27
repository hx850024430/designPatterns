package com.hx.designPatterns.builder;

public class LowHouseBuilder extends AbstractBuilder{
    @Override
    void buildHigh() {
        super.house.setHigh("10米");
    }

    @Override
    void buildWidth() {
        super.house.setWide("5米");
    }
}
