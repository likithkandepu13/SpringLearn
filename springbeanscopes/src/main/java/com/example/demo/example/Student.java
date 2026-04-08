package com.example.demo.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype")
@Component
public class Student {
	@Value("21")
    private int sid;
	@Value("likith")
    private String sname;

    public Student() {
        System.out.println("Student Object created");
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }



    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

  

}
