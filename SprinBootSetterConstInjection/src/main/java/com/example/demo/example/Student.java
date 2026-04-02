package com.example.demo.example;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String sname;
	
	public Student()
	{
		System.out.println("Student obj created");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
