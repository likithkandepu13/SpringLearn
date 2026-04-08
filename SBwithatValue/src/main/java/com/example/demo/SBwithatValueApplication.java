package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.Employee;

@SpringBootApplication
public class SBwithatValueApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con =  SpringApplication.run(SBwithatValueApplication.class, args);
		Employee emp =  (Employee) con.getBean("employee");
		System.out.println(emp.getEname());
		System.out.println(emp.getEid());
		System.out.println(emp.driver.getDname());
	}

}
