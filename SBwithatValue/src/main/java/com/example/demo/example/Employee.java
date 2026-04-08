package com.example.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	//@Value("210")
	
	@Value("${employee.id}")
	int eid;
	//@Value("likith") in string direct valu insertion is not accepted
	
	@Value("${employee.name}")
	String ename;
	
	@Autowired
	public Driver driver;
	
	public Employee()
	{
		System.out.println("employee obj is created");
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
