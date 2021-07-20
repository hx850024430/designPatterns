package com.hx.designPatterns.adaptrer.InterfaceAdapter;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();

        target.charge(new AbsAdapter() {
            @Override
            public int charge5V() {
                System.out.println("实现了5V的充电功能！！");
                int voltage = 5;
                return voltage;
            }
        });
    }
}
