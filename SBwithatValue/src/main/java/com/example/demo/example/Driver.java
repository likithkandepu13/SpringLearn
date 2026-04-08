package com.example.demo.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver 
{
	int did;
	String dname;
	
	public int getDid() {
		return did;
	}
	
	@Value("${driver.id}")
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	@Value("${driver.name}")
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
