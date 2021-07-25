package com.hx.designPatterns.state;

public class CanNotLoState implements LotteryState{
    private Context context;

    public CanNotLoState(Context context) {
        this.context = context;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除积分，可以开始抽奖了......");
        context.setState(context.getCanLoState());
    }

    @Override
    public boolean doLottery() {
        System.out.println("不可以进行抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不可以获取奖品！");
    }
}
