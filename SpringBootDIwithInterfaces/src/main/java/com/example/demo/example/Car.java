package com.example.demo.example;

import org.springframework.stereotype.Component;

@Component
public class Car implements VehicleType
{

	@Override
	public String vehicletype() {
		// TODO Auto-generated method stub
		return "KIA SELTOS";
	}

}
