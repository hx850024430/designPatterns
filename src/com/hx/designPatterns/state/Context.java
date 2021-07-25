package com.hx.designPatterns.state;

public class Context {
    LotteryState state = null;
    int count = 0;
    LotteryState canLoState = new CanLoState(this);
    LotteryState canNotLoState = new CanNotLoState(this);
    LotteryState gainNoneState = new GainNoneState(this);
    LotteryState gainPrizeState = new GainPrizeState(this);

    public Context(int count) {
        this.state = getCanNotLoState();
        this.count = count;
    }

    public void deduceMoney(){
        this.state.deduceMoney();
    }

    public void doLottery(){
        if (this.state.doLottery()){
            this.state.dispensePrize();
        }
    }
    public LotteryState getState() {
        return state;
    }

    public void setState(LotteryState state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LotteryState getCanLoState() {
        return canLoState;
    }

    public void setCanLoState(LotteryState canLoState) {
        this.canLoState = canLoState;
    }

    public LotteryState getCanNotLoState() {
        return canNotLoState;
    }

    public void setCanNotLoState(LotteryState canNotLoState) {
        this.canNotLoState = canNotLoState;
    }

    public LotteryState getGainNoneState() {
        return gainNoneState;
    }

    public void setGainNoneState(LotteryState gainNoneState) {
        this.gainNoneState = gainNoneState;
    }

    public LotteryState getGainPrizeState() {
        return gainPrizeState;
    }

    public void setGainPrizeState(LotteryState gainPrizeState) {
        this.gainPrizeState = gainPrizeState;
    }
}
