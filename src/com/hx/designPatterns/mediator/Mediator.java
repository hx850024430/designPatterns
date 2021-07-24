package com.hx.designPatterns.mediator;


public abstract class Mediator {
    public abstract void registerColleague(String colleagueName, Colleague colleague);
    public abstract void sentMessage();
    public abstract void getMessage(int actionStatement, String colleagueName);
}
