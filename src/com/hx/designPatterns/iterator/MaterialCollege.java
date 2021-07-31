package com.hx.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MaterialCollege implements College{
    ArrayList<Department> departmentArrayList;
    @Override
    public String getName() {
        return getClass().getName();
    }

    public MaterialCollege() {
        this.departmentArrayList = new ArrayList<>();
        addDepartment("材料科学与工程","古法炼丹");
        addDepartment("材料基因工程","新法炼丹");
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentArrayList.add(new Department(name,desc));
    }

    @Override
    public Iterator createIterator() {
        return new MaterialCollegeIterator(departmentArrayList);
    }
}
