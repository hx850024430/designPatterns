package com.hx.designPatterns.mediator;

public abstract class Colleague {

    private Mediator relatedMediator;
    public String colleagueName;

    public Colleague(Mediator relatedMediator, String colleagueName) {
        this.relatedMediator = relatedMediator;
        this.colleagueName = colleagueName;
    }

    public Mediator getMediator(){
        return this.relatedMediator;
    }

    public abstract void sentMessage(int actionStatement);
}
