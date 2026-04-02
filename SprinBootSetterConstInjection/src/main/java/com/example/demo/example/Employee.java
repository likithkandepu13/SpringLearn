package com.example.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int eid;
	private String ename;
	private Student student;
	public Employee()
	{
		System.out.println("Employee obj is created");
	}
	
	public Student getStudent() {
		return student;
	}
	
//	@Autowired
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	@Autowired
	public Employee(Student student) {
		super();
		this.student = student;
	}
	public int getEid() {
		return eid;
	}
	
	

	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
