package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;

public class PropertyInjectedController {
	
	//BAD Example for DI - exposing instance variables as public
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return getGreetingService().sayGreeting();
	}

	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}
	
}
