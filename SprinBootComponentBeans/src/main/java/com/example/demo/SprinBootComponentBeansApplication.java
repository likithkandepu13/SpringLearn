package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.school.Faculty;
import com.example.demo.school.Student;

@SpringBootApplication
public class SprinBootComponentBeansApplication {

	public static void main(String[] args) {
		 ApplicationContext con = SpringApplication.run(
			        SprinBootComponentBeansApplication.class, args
			    );
		 Faculty faculty = (Faculty) con.getBean("faculty");
		 System.out.println(faculty.getStudent().getSname());
		 System.out.println(faculty.getStudent().getSid());
		 
		
	}
	
	@Primary
	@Bean
	public Student sudent1()
	{
		Student s=new Student();
		s.setSid(1);
		s.setSname("saiSAi");
		return s;
	}

}
