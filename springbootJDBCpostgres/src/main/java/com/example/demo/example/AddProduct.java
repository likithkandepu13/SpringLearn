package com.example.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AddProduct {
	
	// get the predefined class obj
	@Autowired
	JdbcTemplate jdbctemplate;
	
	String query = "INSERT INTO product(pname,pid) VALUES('biscuit',22);";
	public void addP()
	{
		jdbctemplate.update(query);
		System.out.println("inserted successfully");
	}
}
