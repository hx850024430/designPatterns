package com.hx.designPatterns.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {
    Department[] departments;
    int count = 0;
    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return count < departments.length && departments[count] != null;
    }

    @Override
    public Department next() {
        return departments[count++];
    }
}
