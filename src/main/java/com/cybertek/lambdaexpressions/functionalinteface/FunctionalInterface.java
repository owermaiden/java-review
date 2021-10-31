package com.cybertek.lambdaexpressions.functionalinteface;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(20));


        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());

        Consumer<Integer> display = System.out::println;
        display.accept(10);

        Predicate<Integer> lesserThan = i -> i<10;
        System.out.println(lesserThan.test(5));
    }

}
