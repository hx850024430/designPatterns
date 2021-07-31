package com.hx.designPatterns.composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class University extends OrganComponent {
    private ArrayList<OrganComponent> organComponentArrayList = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganComponent organComponent) {
        organComponentArrayList.add(organComponent);
    }

    @Override
    protected void remove(OrganComponent organComponent) {
        organComponent.remove(organComponent);
    }

    @Override
    protected void print() {
        System.out.println(getName() + "|" + getDesc());
        for (OrganComponent organComponent : organComponentArrayList) {
            organComponent.print();
        }
    }
}
