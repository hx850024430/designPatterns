package com.hx.designPatterns.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk soyaMilk = new RedBean();
        soyaMilk.make();
        soyaMilk = new BlackBean();
        soyaMilk.make();
    }
}
