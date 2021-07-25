package com.hx.designPatterns.memento;

public class Memento {
    private Integer HP;
    private Integer MP;
    private Integer EXP;

    public Memento(Integer HP, Integer MP, Integer EXP) {
        this.HP = HP;
        this.MP = MP;
        this.EXP = EXP;
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
}
