package com.hx.designPatterns.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        College college = new MaterialCollege();
        Iterator iterator = college.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
