package org.xmlconfig.setter;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int num;
    private String address;

    public Address() {
        System.out.println("Address Object created");
    }

    public String getAddress() {
        return address;
    }


    public int getNum() {
        return num;
    }

}
