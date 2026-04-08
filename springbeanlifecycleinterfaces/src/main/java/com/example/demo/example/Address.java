package com.example.demo.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Address implements InitializingBean, DisposableBean {

    private String city;
    private String state;

    public Address() {
        System.out.println("Address constructor called");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Address InitializingBean afterPropertiesSet");
    }

    @Override
    public void destroy() {
        System.out.println("Address DisposableBean destroy");
    }
}