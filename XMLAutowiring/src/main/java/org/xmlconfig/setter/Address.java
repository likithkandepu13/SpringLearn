package org.xmlconfig.setter;

public class Address {
    private int num;
    private String address;

    public Address() {
        System.out.println("Address Object created");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
