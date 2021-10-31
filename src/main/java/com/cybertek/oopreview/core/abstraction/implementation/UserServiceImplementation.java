package com.cybertek.oopreview.core.abstraction.implementation;

import com.cybertek.oopreview.core.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);
}
