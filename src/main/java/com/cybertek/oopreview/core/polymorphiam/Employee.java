package com.cybertek.oopreview.core.polymorphiam;

import com.cybertek.oopreview.core.encapsulation.User;
import com.cybertek.oopreview.core.inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity {

    private int employeeId;
    private String EmployeeTask;
    private User employeeManager;

    public void getEmployeeHours(){
        System.out.println("40 hours a week");
    }
}
