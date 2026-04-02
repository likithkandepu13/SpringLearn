package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.example.Student;

@Configuration
public class SpringConfigClass {
	@Primary
    @Bean
    public Student newStudent()
	{
		Student s = new Student();
		s.setSid(10);
		s.setSname("sai ram");
		return s;
	}

}
