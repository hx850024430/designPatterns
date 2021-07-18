package com.hx.designPatterns.singleton;

public class SingleLazy2 {
    private SingleLazy2(){};
    private static class Inner{
        private static final SingleLazy2 singleton= new SingleLazy2();
    }
    public static SingleLazy2 getInstance(){
        return Inner.singleton;
    }
}
