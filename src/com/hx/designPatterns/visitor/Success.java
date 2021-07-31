package com.hx.designPatterns.visitor;

public class Success implements Action{
    @Override
    public void getManResult() {
        System.out.println("男生的结果是：成功！");
    }

    @Override
    public void getWomanResult() {
        System.out.println("女生的结果是：成功");
    }
}
