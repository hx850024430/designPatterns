package com.hx.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MaterialCollegeIterator implements Iterator<Department> {
    ArrayList<Department> departmentArrayList;
    int departLength = 0;
    public MaterialCollegeIterator(ArrayList<Department> departmentArrayList) {
        this.departmentArrayList = departmentArrayList;
    }

    @Override
    public boolean hasNext() {
        return departLength < departmentArrayList.size();
    }

    @Override
    public Department next() {
        return departmentArrayList.get(departLength++);
    }
}
