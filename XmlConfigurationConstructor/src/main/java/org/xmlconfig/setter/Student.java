package org.xmlconfig.setter;

public class Student {
    private int sid;
    private String sname;
    private Address address;

    public Student() {
        System.out.println("Student Object created");
    }

    public Student(Address address, String sname, int sid) {
        this.address = address;
        this.sname = sname;
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public Address getAddress() {
        return address;
    }
}
