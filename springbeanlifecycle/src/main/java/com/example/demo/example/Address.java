package com.example.demo.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class Address {

    private String city;
    private String state;

    public Address() {
        System.out.println("Address constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("Address @PostConstruct init");
        this.city = "Guntur";
        this.state = "AP";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Address @PreDestroy destroy");
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}