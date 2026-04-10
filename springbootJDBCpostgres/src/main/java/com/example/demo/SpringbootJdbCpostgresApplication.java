package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.AddProduct;

@SpringBootApplication
public class SpringbootJdbCpostgresApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con = SpringApplication.run(SpringbootJdbCpostgresApplication.class, args);
	AddProduct prd = (AddProduct) con.getBean(AddProduct.class);
	prd.addP();
	}

}
