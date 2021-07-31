package com.hx.designPatterns.template;

public class BlackBean extends SoyaMilk{
    @Override
    void select() {
        System.out.println("挑选一些精品黑豆");
    }

    @Override
    boolean needCondiments() {
        return true;
    }

    @Override
    void addCondiments() {
        System.out.println("添加一些芝麻糊.....");
    }
}
