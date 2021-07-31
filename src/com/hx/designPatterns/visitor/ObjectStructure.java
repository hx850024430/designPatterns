package com.hx.designPatterns.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();
    public void attach(Person person){
        personList.add(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void display(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
