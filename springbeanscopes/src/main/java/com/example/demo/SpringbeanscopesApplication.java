package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.Student;

@SpringBootApplication
public class SpringbeanscopesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringbeanscopesApplication.class, args);
		Student s = (Student) con.getBean("student");
		System.out.println(s.getSname());
		Student s1 = (Student) con.getBean("student");
		
	}

}
