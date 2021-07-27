package com.hx.designPatterns.builder;

public class HighHouseBuilder extends AbstractBuilder{
    @Override
    void buildHigh() {
        System.out.println("房子的高度设定为100米！");
        super.house.setHigh("100米");
    }

    @Override
    void buildWidth() {
        System.out.println("房子的宽度设定为70米！");
        super.house.setWide("10米");
    }
}
