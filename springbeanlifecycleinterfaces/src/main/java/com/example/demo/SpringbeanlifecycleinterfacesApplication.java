package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.Student;

@SpringBootApplication
public class SpringbeanlifecycleinterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbeanlifecycleinterfacesApplication.class, args);

        ConfigurableApplicationContext context =
                SpringApplication.run(SpringbeanlifecycleinterfacesApplication.class, args);

        Student s = context.getBean(Student.class);
        s.display();
	}

}
