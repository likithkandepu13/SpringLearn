package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.example.Employee;

@SpringBootApplication
public class SprinBootSetterConstInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext cont = SpringApplication.run(SprinBootSetterConstInjectionApplication.class, args);
		Employee emp = (Employee) cont.getBean("employee");
		System.out.println(emp.getStudent());
		System.out.println(emp.getStudent().getSid());
		System.out.println(emp.getStudent().getSname());
	}

}
