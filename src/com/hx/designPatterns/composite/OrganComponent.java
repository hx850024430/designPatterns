package com.hx.designPatterns.composite;

public abstract class OrganComponent {
    private String name;
    private String desc;

    public OrganComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected void add(OrganComponent organComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganComponent organComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    protected abstract void print();
}
