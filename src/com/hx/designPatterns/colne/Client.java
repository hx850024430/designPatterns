package com.hx.designPatterns.colne;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("dolly",2,"white");
        sheep.setFriend(new Sheep("friend",1,"grey"));
        System.out.println(sheep+" "+sheep.friend);
        Sheep clone = sheep.clone();
        System.out.println(clone+" "+clone.friend);
        System.out.println(clone.friend == sheep.friend);
    }
}
