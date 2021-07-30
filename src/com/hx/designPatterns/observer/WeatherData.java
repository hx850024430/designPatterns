package com.hx.designPatterns.observer;

import java.util.ArrayList;

public class WeatherData implements Observable {
    private Float temperature;
    private Float pressure;
    private Float humidity;
    private ArrayList<Observe> observeArrayList;

    public WeatherData() {
        this.observeArrayList = new ArrayList<>();
    }

    @Override
    public void addObserve(Observe observe) {
        observeArrayList.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        observeArrayList.remove(observe);
    }

    @Override
    public void notifyAllObserve() {
        for (Observe observe : observeArrayList) {
            observe.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void setData(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyAllObserve();
    }
}
