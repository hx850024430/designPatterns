package com.hx.designPatterns.mediator;

public class TV extends Colleague{

    public TV(Mediator relatedMediator, String colleagueName) {
        super(relatedMediator, colleagueName);
        relatedMediator.registerColleague(colleagueName,this);
    }

    @Override
    public void sentMessage(int actionStatement) {
        this.getMediator().getMessage(actionStatement, this.colleagueName);
    }

    public void startTV(){
        System.out.println("TV start!");
    }

    public void closeTV(){
        System.out.println("TV Close!");
    }
}
