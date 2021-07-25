package com.hx.designPatterns.memento;

import jdk.nashorn.internal.objects.annotations.Setter;


public class GameRole {
    private Integer HP;
    private Integer MP;
    private Integer EXP;

    public GameRole(Integer HP, Integer MP, Integer EXP) {
        this.HP = HP;
        this.MP = MP;
        this.EXP = EXP;
    }

    public Memento saveState() {
        return new Memento(HP, MP, EXP);
    }

    public void reloadState(Memento memento) {
        if (memento != null) {
            HP = memento.getHP();
            MP = memento.getMP();
            EXP = memento.getEXP();
        }
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getMP() {
        return MP;
    }

    public Integer getEXP() {
        return EXP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public void setEXP(Integer EXP) {
        this.EXP = EXP;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "HP=" + HP +
                ", MP=" + MP +
                ", EXP=" + EXP +
                '}';
    }
}
