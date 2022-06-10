package com.cybertek.staticFactoryMethod;

public class Runner {
    public static void main(String[] args) {

        // By this way we can instantiate a class with a Static Factory Method...Gives more control over instance
        Fenerbahce futboller = Fenerbahce.addFutboller("Mesut");
    }
}
