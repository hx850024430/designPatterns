package com.hx.designPatterns.observe;

public interface Observable {
    void addObserve(Observe observe);
    void removeObserve(Observe observe);
    void notifyAllObserve();
}
