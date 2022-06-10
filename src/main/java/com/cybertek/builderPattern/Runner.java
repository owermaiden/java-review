package com.cybertek.builderPattern;

public class Runner {
    public static void main(String[] args) {

        Starbucks coffee = new Starbucks.Builder("tall").laktozsuzMilk("yes").isSoft(true).build();
    }
}
