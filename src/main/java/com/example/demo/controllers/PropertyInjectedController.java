package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	
	//BAD Example for DI - exposing instance variables as public
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return getGreetingService().sayGreeting();
	}
	
	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}
	
}
