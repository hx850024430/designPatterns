package com.hx.designPatterns.state;

public class GainPrizeState implements LotteryState{
    Context context = null;

    public GainPrizeState(Context context) {
        this.context = context;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经获取奖品，请先领取奖品");
    }

    @Override
    public boolean doLottery() {
        System.out.println("已经获取奖品，请先领取奖品");
        return false;
    }

    @Override
    public void dispensePrize() {
        int count = context.getCount();
        if (count > 1){
            context.setCount(count - 1);
            System.out.println("成功获取到一个奖品！！！");
            context.setState(context.getCanNotLoState());
        }else {
            System.out.println("奖品已经领完了，请下次再来！");
            context.setState(context.getGainNoneState());
        }
    }
}
