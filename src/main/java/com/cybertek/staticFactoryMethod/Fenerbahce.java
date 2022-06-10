package com.cybertek.staticFactoryMethod;

public class Fenerbahce {

    private String name;
    private int age;

    public Fenerbahce(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Fenerbahce addFutboller(String name){
        return new Fenerbahce(name, 22);
    }
}
