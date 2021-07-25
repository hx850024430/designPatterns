package com.hx.designPatterns.responsibilityChain;

public class SchoolMaster extends Approver{
    public SchoolMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getMoney() > 30000){
            System.out.println(name + "处理了这个请求");
        }else {
            successor.processRequest(request);
        }
    }
}
