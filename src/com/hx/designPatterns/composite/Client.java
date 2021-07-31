package com.hx.designPatterns.composite;

public class Client {
    public static void main(String[] args) {
        Department department = new Department("计算机科学与技术","搞底层");
        Department department2 = new Department("软件工程","搞应用");
        Department department3 = new Department("材料科学与工程","搞锤子");
        Department department1 = new Department("材料基因大数据","实际上还是搞锤子");
        University university = new University("XMU","福建某985");
        College college = new College("计算机学院","钱多掉头发");
        College college2 = new College("材料科学与工程学院","越老越吃香");

        university.add(college);
        university.add(college2);

        college.add(department);
        college.add(department2);

        college2.add(department1);
        college2.add(department3);

        university.print();
    }
}
