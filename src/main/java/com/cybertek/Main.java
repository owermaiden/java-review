package com.cybertek;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oopreview.core.abstraction.service.UserService;
import com.cybertek.oopreview.core.encapsulation.Role;
import com.cybertek.oopreview.core.encapsulation.User;
import com.cybertek.oopreview.core.inheritance.BaseEntity;
import com.cybertek.oopreview.core.inheritance.Project;
import com.cybertek.oopreview.core.polymorphiam.Employee;
import com.cybertek.oopreview.core.streams.exercises.DataGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        User user = new User("omer", "erden", new Role(1, "mentor"), Gender.MALE);

        //---------------Encapsulation-------------------
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //-----------------Inheritance--------------------

        Project project = new Project(1, LocalDateTime.now(),2,LocalDateTime.now(),3,"dummy",
                "newProject", user, LocalDate.of(2021,01,03),LocalDate.of(2021,01,29),
                Status.IN_PROGRESS, "about");

        // -------------Interface--------------------------
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        // -------------Polymorphizm------------------------

        Employee employee = new Employee();
        BaseEntity employee2 = new Employee(); // Left side is Parent/Interface---right side is child/class implementing interface
        //reference type ----- new Object Type //

        employee.getEmployeeHours();
        ((Employee)employee2).getEmployeeHours(); // if we use type of interface or parent we need to down-cast object in order to use child's methods...

        //---------------Enums-------------------------------

        User user1 = new User("ahmet", "mehmet", new Role(3, "Admin"), Gender.FEMALE);
        System.out.println(user1);
        System.out.println(user1.getFirstName());
        System.out.println(DataGenerator.getProjects().get(0).getProjectStatus().getValue());
        System.out.println(Status.IN_PROGRESS.getValue().charAt(2));  // this is String now...Enum can be converted this way...

    }
}
