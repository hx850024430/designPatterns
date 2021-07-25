package com.hx.designPatterns.state;

import java.util.Random;

public class CanLoState implements LotteryState{
    Context context = null;

    public CanLoState(Context context) {
        this.context = context;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经支付过钱了，可以进行抽奖");
    }

    @Override
    public boolean doLottery() {
        System.out.println("准备开始抽奖！");
        Random random = new Random();
        int i = random.nextInt(10);
        if (i == 0){
            System.out.println("恭喜抽中了！");
            context.setState(context.getGainPrizeState());
            return true;
        }else {
            System.out.println("很抱歉，没有中奖");
            context.setState(context.getCanNotLoState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("还没有抽奖，无法进行奖品获取");
    }
}
