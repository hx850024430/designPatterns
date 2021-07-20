package com.hx.designPatterns.adaptrer.ClassAdapter;

public class Target {
    public void charge(ICharge charge5V){
        if (charge5V.charge5V() == 5){
            System.out.println("开始进行5V的充电.....");
        }else {
            System.out.println("电压不对，无法进行充电！");
        }
    }
}
