package com.example.demo.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;

    @Autowired
    private Address address;

    public Student() {
        System.out.println("Student constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("Student @PostConstruct init");
        this.id = 101;
        this.name = "Likith";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Student @PreDestroy destroy");
    }

    public void display() {
        System.out.println(id + " " + name);
        System.out.println(address.getCity() + " " + address.getState());
    }
}