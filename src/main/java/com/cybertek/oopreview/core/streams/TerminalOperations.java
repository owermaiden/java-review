package com.cybertek.oopreview.core.streams;

import com.cybertek.collections.ArrayLists;
import com.cybertek.oopreview.core.encapsulation.Role;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        long repeater = Stream.of("Apple", "Orange", "Kiwi","Apple", "Banana", "Mango")
                .filter(str -> str.equals("Apple"))
                .count();

        //-------------------FİND FİRST---------------------------------------------

        Role r = ArrayLists.createRoleList()
                .stream()
                .filter(role -> role.getDescription().equals("employee"))
                .findFirst().get();                                                 // NullPointerExeption u engellemek Optional döndürüyorsa get() ile sonucu alabiliriz...


                //.findAny().get();

        // ----------------------------COLLECT----------------------------------------

        List<String> appleList = Stream.of("Apple", "Orange", "Kiwi","Apple", "Banana", "Mango")
                .filter(s-> s.equals("Apple"))
                .collect(Collectors.toList());

        System.out.println(appleList);

        // -------------------------REDUCE--------------------------------------------

        int result = Stream.of(1,2,3,4,5,6,7,8,9)
                .reduce(0, (carry, x) -> carry+x);      // Integer::sum

        System.out.println(result);

        String word = Stream.of("C","Y","B","E","R")
                .reduce("", (carry, a) -> carry + a);

        System.out.println(word);

    }
}
