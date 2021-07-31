package com.hx.designPatterns.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepart = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("计算机科学","头有点秃");
        addDepartment("网络工程","重启试试");
    }

    @Override
    public String getName() {
        return getClass().getName();
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        this.departments[numOfDepart] = department;
        numOfDepart++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
