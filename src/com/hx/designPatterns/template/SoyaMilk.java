package com.hx.designPatterns.template;

public abstract class SoyaMilk {
    final void make(){
        select();
        if (needCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }
    void select(){
        throw new UnsupportedOperationException();
    }

    void soak(){
        System.out.println("开始浸泡豆子.....");
    }

    void beat(){
        System.out.println("将浸泡后的豆子打成汁");
    }

    boolean needCondiments(){
        return false;
    }

    void addCondiments(){
        throw new UnsupportedOperationException();
    }
}
