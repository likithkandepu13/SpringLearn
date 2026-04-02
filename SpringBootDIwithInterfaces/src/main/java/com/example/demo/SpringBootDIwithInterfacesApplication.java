package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.example.Garrage;
import com.example.demo.example.VehicleType;

@SpringBootApplication
public class SpringBootDIwithInterfacesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont =  SpringApplication.run(SpringBootDIwithInterfacesApplication.class, args);
		Garrage g = (Garrage) cont.getBean("garrage");
		System.out.println(g.getVehicle().vehicletype());
	}

}
