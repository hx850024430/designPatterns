package com.hx.designPatterns.mediator;

public class Curtain extends Colleague {
    public Curtain(Mediator relatedMediator, String colleagueName) {
        super(relatedMediator, colleagueName);
        relatedMediator.registerColleague(this.colleagueName,this);
    }

    @Override
    public void sentMessage(int actionStatement) {
        getMediator().getMessage(actionStatement,this.colleagueName);
    }

    public void curtainOn(){
        System.out.println("curtain is rising~~~~");
    }

    public void curtainDown(){
        System.out.println("curtain is downing~~~");
    }
}
