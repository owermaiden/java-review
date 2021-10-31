package com.cybertek.oopreview.core.streams.exercises;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oopreview.core.encapsulation.User;
import com.cybertek.oopreview.core.inheritance.Project;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    // Task-1 -------------
    public static List<Project> getListOfProject(){
        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects;
    }

    // Task-2 -------------
    public static List<Project> getListOfProject(Status status){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getProjectStatus().equals(status))
                .collect(Collectors.toList());
    }


    // Task-3 -------------
    public static List<Project> getListOfProject(User manager){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getAssignedManager().equals(manager))
                .collect(Collectors.toList());
    }


    // Task-4 -------------
    public static List<Project> getProjectByProjectCode(String projectCode){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getProjectCode().equals(projectCode))
                .collect(Collectors.toList());
    }


    // Task-5 -------------
    public static List<User> getListOfUsers(){
        return new ArrayList<>(DataGenerator.getUsers());

    }

    // Task-6 -------------
    public static User getUsersByFirstName(String firstName){
        return DataGenerator.getUsers()
                .stream()
                .filter(user -> user.getFirstName().equals(firstName))
                .findAny().orElse(null);

        // findFirst().get();   de olur....

    }


    // Task-7 -------------
    public static String getUserByUserId(Long id){
        return DataGenerator.getUsers()
                .stream()
                .filter(user -> user.getId() != id)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .findFirst().get();

    }


    // Task-8 -------------
    public static List<User> deleteUser(String firstName){
        return DataGenerator.getUsers()
                .stream()
                .filter(user -> !user.getFirstName().equals(firstName))
                .collect(Collectors.toList());
    }



    // Task-9 -------------
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getProjectStatus().equals(oldStatus))
                .peek(pro -> pro.setProjectStatus(newStatus))
                .collect(Collectors.toList());
    }


    // Task-10 -------------
    public static List<Project> findProjectByManager(User manager){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getAssignedManager().equals(manager))
                .collect(Collectors.toList());

    }

    // Task-11 -------------Period
    public static Integer totalProjectDurationForManager(User manager){
        return DataGenerator.getProjects()
                .stream()
                .filter(pro -> pro.getAssignedManager().equals(manager))
                .mapToInt(pro -> Period.between(pro.getStartDate(), pro.getEndDate()).getDays())
                .sum();

    }

    // Task-12 -------------
    public static long findTotalMaleInCompany(){
        return DataGenerator.getUsers()
                .stream()
                .filter(user -> user.getGender().equals(Gender.MALE))
                .count();

    }





}
