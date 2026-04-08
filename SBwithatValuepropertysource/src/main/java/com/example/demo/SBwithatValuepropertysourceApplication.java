package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value={"aws.properties"})
@SpringBootApplication
public class SBwithatValuepropertysourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con =  SpringApplication.run(SBwithatValuepropertysourceApplication.class, args);
		Driver driver = (Driver) con.getBean("driver");
		System.out.println(driver.getDname());
	}

}
