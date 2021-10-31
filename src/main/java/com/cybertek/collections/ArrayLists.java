package com.cybertek.collections;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oopreview.core.encapsulation.Role;
import com.cybertek.oopreview.core.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList(){
        List<Integer> list = new ArrayList<>();  // Integer means wrapper class...
        list.add(10);
        list.add(20);
        list.add(30);
        for(Integer l : list){
            System.out.println(l);
        }
    }

    public static void createUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike", "Smith", new Role(2,"Admin"), Gender.FEMALE));
        userList.add(new User("Emre", "Dıncsoy", new Role(1,"Admin"), Gender.FEMALE));
        for (User u : userList){
            System.out.println(u.getRole().getDescription());
        }
    }

    public static List<Role> createRoleList(){
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"manager"));
        roleList.add(new Role(2,"employee"));
        roleList.add(new Role(3,"admin"));
        roleList.add(new Role(4,"employee"));
        return roleList;

    }
}
