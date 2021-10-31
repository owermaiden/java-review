package com.cybertek.oopreview.core.abstraction.service;

import com.cybertek.enums.Gender;
import com.cybertek.oopreview.core.abstraction.implementation.UserServiceImplementation;
import com.cybertek.oopreview.core.encapsulation.Role;
import com.cybertek.oopreview.core.encapsulation.User;

public class UserService implements UserServiceImplementation {

    @Override
    public String userByRoleId(int id) {
        User user = new User("mike", "maiden", new Role(id,"mentor"), Gender.FEMALE);
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName, "herre", new Role(2,"mentor"), Gender.MALE);
        return user;
    }
}
