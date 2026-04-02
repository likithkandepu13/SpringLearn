package com.example.demo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garrage 
{
	@Qualifier("car") // qualifier has more priority than the @primary
	@Autowired
	VehicleType vehicle;
	public VehicleType getVehicle()
	{
		return vehicle;
	}
	
}
