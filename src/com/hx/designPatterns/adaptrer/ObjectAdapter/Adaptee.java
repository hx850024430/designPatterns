package com.hx.designPatterns.adaptrer.ObjectAdapter;

public class Adaptee {
    public int charge220V(){
        int source = 220;
        System.out.println("电压为"+source+"伏");
        return source;
    }
}
