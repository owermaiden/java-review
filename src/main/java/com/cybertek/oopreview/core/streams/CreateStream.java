package com.cybertek.oopreview.core.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oopreview.core.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        String[] courses = {"Java", "JS", "TS", "API", "Selenium"};
        Stream<String> courseStream = Arrays.stream(courses);            // from an array

        Stream<Role> roleStream = ArrayLists.createRoleList().stream();   // from a collection

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);               // from values

    }
}
