package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xmlconfig.setter.Student;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        Student s = (Student) context.getBean("getStudent");

        System.out.println(s.getSid());
        System.out.println(s.getSname());

    }
}