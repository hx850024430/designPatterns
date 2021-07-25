package com.hx.designPatterns.state;

public interface LotteryState {
    void deduceMoney();
    boolean doLottery();
    void dispensePrize();
}
