package com.hx.designPatterns.memento;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100,100,0);
        System.out.println(gameRole);
        System.out.println("开始了一场战斗，获得30EXP");
        gameRole.setEXP(30);
        gameRole.setHP(80);
        gameRole.setMP(75);
        System.out.println(gameRole);
        CreateTacker createTacker = new CreateTacker();
        createTacker.saveState(gameRole.saveState());
        System.out.println("开始第二场战斗，获得50EXP");
        gameRole.setEXP(80);
        gameRole.setHP(50);
        gameRole.setMP(25);
        createTacker.saveState(gameRole.saveState());
        System.out.println(gameRole);
        System.out.println("开始归档到第一次战斗后");
        gameRole.reloadState(createTacker.reloadState(0));
        System.out.println(gameRole);
    }
}
