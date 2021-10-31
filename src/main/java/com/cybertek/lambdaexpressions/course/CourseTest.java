package com.cybertek.lambdaexpressions.course;

public class CourseTest {
    public static void main(String[] args) {

        // if interface has more than 1 abstract meyhod we can use below statement to use them...not lambda...
        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();

        Course java2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();


        /*******************************************/

        // if it is a functional interface we can use lambda expressions..
        // fuctional intefaces are the interfaces which has only one abstract method...

        Course javaCourse = () -> System.out.println("Stdying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();


    }


}
