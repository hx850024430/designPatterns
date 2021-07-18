package com.hx.designPatterns.singleton;

public class SinglePerfect {

    private enum Perfect{
        INSTANCE("5","c");
        private final SinglePerfect singlePerfect;

        Perfect(String a, String b){
            singlePerfect = new SinglePerfect();
        }
        public void print(){
            System.out.println("aaa");
        }
    }
    public  SinglePerfect getInstance(){
        return Perfect.INSTANCE.singlePerfect;
    }

    public static void main(String[] args) {
        Perfect.INSTANCE.print();
        Perfect.INSTANCE.print();
    }
}
