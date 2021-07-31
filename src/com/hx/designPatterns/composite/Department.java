package com.hx.designPatterns.composite;

public class Department extends OrganComponent{
    public Department(String name, String desc) {
        super(name, desc);
    }
    @Override
    protected void print() {
        System.out.println(getName()+"|"+getDesc());
    }
}
