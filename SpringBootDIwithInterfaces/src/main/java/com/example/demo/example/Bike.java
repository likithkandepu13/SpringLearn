package com.example.demo.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements VehicleType{

	@Override
	public String vehicletype() {
		// TODO Auto-generated method stub
		return "classic 350";
	}

}
