package com.hx.designPatterns.responsibilityChain;

public abstract class Approver {
    public String name;
    public Approver successor;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}
