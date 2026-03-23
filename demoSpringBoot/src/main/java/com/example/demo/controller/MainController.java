package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MainController 
{
	@GetMapping("/qwerty")
	public String compile() {
	    System.out.println("Executed");
	    return "Request Reached Controller";
	}

}
