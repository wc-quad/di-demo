package com.example.demo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.services.GreetingServiceImpl;

public class GetterInjectedControllerTest {

	private GetterInjectedController getterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
	}

}
