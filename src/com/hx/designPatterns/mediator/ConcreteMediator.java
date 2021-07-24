package com.hx.designPatterns.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    private HashMap<String,Colleague> colleagueHashMap;

    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<>();
    }

    @Override
    public void registerColleague(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);
    }

    @Override
    public void sentMessage() {

    }

    @Override
    public void getMessage(int actionStatement, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof TV){
            if (actionStatement == 0){
                ((TV) colleagueHashMap.get(colleagueName)).startTV();
                ((Curtain)colleagueHashMap.get("Curtain")).curtainDown();
            }else {
                ((TV) colleagueHashMap.get(colleagueName)).closeTV();
                ((Curtain)colleagueHashMap.get("Curtain")).curtainOn();
            }
        }else if (colleagueHashMap.get(colleagueName) instanceof Curtain){
            if (actionStatement == 0){
                ((Curtain)colleagueHashMap.get(colleagueName)).curtainDown();
                ((TV)colleagueHashMap.get("TV")).startTV();
            }else {
                ((Curtain)colleagueHashMap.get(colleagueName)).curtainOn();
                ((TV)colleagueHashMap.get("TV")).closeTV();
            }
        }
    }
}
