package com.hx.designPatterns.visitor;

public class Fail implements Action{
    @Override
    public void getManResult() {
        System.out.println("男生的结果是：失败！");
    }

    @Override
    public void getWomanResult() {
        System.out.println("女生的结果是：失败！");
    }
}
