package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	//BAD Example for DI - exposing instance variables as public
	@Autowired
	public GreetingService greetingServiceImpl;		// <-- resolved via Reflection (may have unknown side effects at runtime)
	
	public String sayHello() {
		return getGreetingService().sayGreeting();
	}
	
	public GreetingService getGreetingService() {
		return greetingServiceImpl;
	}
	
}
