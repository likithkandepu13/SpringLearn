package com.example.demo.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Student implements InitializingBean, DisposableBean {

    private int id;
    private String name;
    private Address address;

    public Student() {
        System.out.println("Student constructor called");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println(id + " " + name);
        System.out.println(address.getCity() + " " + address.getState());
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Student afterPropertiesSet (init)");
    }

    @Override
    public void destroy() {
        System.out.println("Student destroy");
    }
}