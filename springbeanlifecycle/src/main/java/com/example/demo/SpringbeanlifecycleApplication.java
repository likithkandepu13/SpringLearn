package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.Student;

@SpringBootApplication
public class SpringbeanlifecycleApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context =
	        SpringApplication.run(SpringbeanlifecycleApplication .class, args);

	        Student s = context.getBean(Student.class);
	        s.display();

	}

}
