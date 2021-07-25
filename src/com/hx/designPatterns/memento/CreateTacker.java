package com.hx.designPatterns.memento;

import java.util.ArrayList;

public class CreateTacker {
    private ArrayList<Memento> states = new ArrayList<>();


    public void saveState(Memento memento){
        states.add(memento);
    }

    public Memento reloadState(int state){
        Memento memo = null;
        if (state < states.size()){
            memo = states.remove(state);
        }
        return memo;
    }
}
