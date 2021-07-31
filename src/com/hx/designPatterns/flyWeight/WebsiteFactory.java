package com.hx.designPatterns.flyWeight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebsiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
    public int getWebsiteCount(){
        return pool.size();
    }
}
