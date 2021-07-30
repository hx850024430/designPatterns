package com.hx.designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserve(new SinaNews());
        weatherData.addObserve(new XiamenNews());
        weatherData.setData(35.2f,110.0f,80.2f);
    }
}
