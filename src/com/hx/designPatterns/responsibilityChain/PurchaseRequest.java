package com.hx.designPatterns.responsibilityChain;

public class PurchaseRequest {
    private Integer money;

    public PurchaseRequest(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }
}
