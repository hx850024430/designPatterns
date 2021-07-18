package com.hx.designPatterns.singleton;

public class SingleLazy {
    private SingleLazy(){};
    public static volatile SingleLazy single;
    public static SingleLazy getInstance(){
        if (single == null){
            synchronized (SingleLazy.class){
                if (single == null){
                    single = new SingleLazy();
                }
            }
        }
        return single;
    }
    
}
