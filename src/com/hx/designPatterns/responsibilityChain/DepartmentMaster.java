package com.hx.designPatterns.responsibilityChain;

public class DepartmentMaster extends Approver{
    public DepartmentMaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getMoney() <= 20000){
            System.out.println(name+"处理了这个请求");
        }else {
            successor.processRequest(request);
        }
    }
}
