package com.hx.designPatterns.observer;

public interface Observable {
    void addObserve(Observe observe);
    void removeObserve(Observe observe);
    void notifyAllObserve();
}
