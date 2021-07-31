package com.hx.designPatterns.flyWeight;

public class ConcreteWebSite extends WebSite {
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站发布形式为："+type+"使用者是:"+user.getName());
    }
}
