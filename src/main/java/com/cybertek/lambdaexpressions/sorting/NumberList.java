package com.cybertek.lambdaexpressions.sorting;

import com.cybertek.enums.Gender;
import com.cybertek.oopreview.core.encapsulation.Role;
import com.cybertek.oopreview.core.encapsulation.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);list.add(3);list.add(20);list.add(500);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new MyComparator());  //   ---------------aynı............

        System.out.println(list);

        //-------------with lambda-------------
        list.sort((o1, o2) -> o2.compareTo(o1));     //  ----------------aynı.............
        System.out.println(list);


        User user1 = new User("ahmet", "mehmet", new Role(3, "Admin"), Gender.FEMALE);
        User user2 = new User("dgdg", "mehmet", new Role(7, "Admin"), Gender.FEMALE);
        User user3 = new User("klkjl", "mehmet", new Role(22, "Admin"), Gender.FEMALE);
        User user4 = new User("eeee", "mehmet", new Role(88, "Admin"), Gender.FEMALE);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.sort((o1,o2) -> o1.getRole().getId().compareTo(o2.getRole().getId()));
        System.out.println(users);




    }
}
