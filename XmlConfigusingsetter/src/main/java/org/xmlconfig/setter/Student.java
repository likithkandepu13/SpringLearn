package org.xmlconfig.setter;

public class Student {
    private int sid;
    private String sname;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
        System.out.println("Student Object created");
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
