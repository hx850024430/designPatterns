package com.hx.designPatterns.builder;

public class House {
    private String high;
    private String wide;

    @Override
    public String toString() {
        return "House{" +
                "high='" + high + '\'' +
                ", wide='" + wide + '\'' +
                '}';
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }
}
