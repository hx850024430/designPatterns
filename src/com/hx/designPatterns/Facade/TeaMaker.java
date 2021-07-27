package com.hx.designPatterns.Facade;

public class TeaMaker {
    private Tea tea = new Tea();
    private Water water = new Water();
    private ClassicalMusic classicalMusic = new ClassicalMusic();

    public void makeTea(){
        water.boilWater();
        tea.firstBottle();
        classicalMusic.playMusic();
        tea.drinkableTea();
    }
}
