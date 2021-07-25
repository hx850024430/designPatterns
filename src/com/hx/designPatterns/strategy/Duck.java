package com.hx.designPatterns.strategy;

public abstract class Duck {
    QuackBehavior quackBehavior;

    public void quack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }else {
            throw  new RuntimeException("没有定义该怎么叫！！！");
        }
    }

    public void swim(){
        System.out.println("鸭子游啊游");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
