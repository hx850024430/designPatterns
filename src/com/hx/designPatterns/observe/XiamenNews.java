package com.hx.designPatterns.observe;

public class XiamenNews implements Observe{
    private Float temperature;
    private Float pressure;
    private Float humidity;


    public void display(){
        System.out.println("XiaMen News today temperature:");
        System.out.println("今日温度："+temperature);
        System.out.println("今日气压："+pressure);
        System.out.println("今日湿度："+humidity);
    }

    @Override
    public void update(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity =humidity;
        display();
    }
}
