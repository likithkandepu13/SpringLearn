package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver 
{
	int did;
	
	@Value("${aws.driver}")
	String dname;
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
