package com.hx.designPatterns.flyWeight;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();
        WebSite sina = websiteFactory.getWebsiteCategory("新浪微博");
        sina.Use(new User("小黄"));
    }
}
