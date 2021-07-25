package com.hx.designPatterns.state;

public class GainNoneState implements LotteryState{
    Context context = null;

    public GainNoneState(Context context) {
        this.context = context;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发完了，请下次再参加！");
    }

    @Override
    public boolean doLottery() {
        System.out.println("奖品发完了，请下次再参加！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发完了，请下次再参加！");
    }
}
