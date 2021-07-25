package com.hx.designPatterns.responsibilityChain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(25000);
        SchoolMaster schoolMaster = new SchoolMaster("校长");
        SchoolViceMaster schoolViceMaster = new SchoolViceMaster("副校长");
        DepartmentMaster departmentMaster = new DepartmentMaster("王主任");
        schoolMaster.setSuccessor(departmentMaster);
        departmentMaster.setSuccessor(schoolViceMaster);
        schoolViceMaster.setSuccessor(schoolMaster);
        schoolMaster.processRequest(purchaseRequest);
    }
}
