package com.hx.designPatterns.template;



public class RedBean extends SoyaMilk {
    @Override
    void select() {
        System.out.println("挑选一些精品红豆");
    }

    @Override
    boolean needCondiments() {
        return true;
    }

    @Override
    void addCondiments() {
        System.out.println("add some suger");
    }
}
