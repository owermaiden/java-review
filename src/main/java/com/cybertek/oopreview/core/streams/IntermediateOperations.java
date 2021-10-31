package com.cybertek.oopreview.core.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        Integer[] numberArray = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> numbersStream = Arrays.stream(numberArray);

        // ----------------FILTER-----------------------------
        int result = (int) numbersStream.filter(number -> number%2 !=0).count();
        System.out.println(result);

        Stream<String> strStream = Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Mango").stream();

        System.out.println(strStream.filter(str -> str.length() == 5).count());

        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed....
        // tekrar stream oluşturmak gerekir...
        // System.out.println(strStream.filter(str -> str.length() == 5).count()); // ERROR

        Arrays.asList("Apple", "Orange", "Kiwi", "Banana", "Mango")
                .stream()
                .filter(str -> str.equals("Apple"))
                .forEach(System.out::println);

        // --------------MAP------------------------------------

        Stream.of("Apple", "Orange", "Kiwi","Apple", "Banana", "Mango")
                .distinct()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}
