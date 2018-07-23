package com.darkenrule.app.ws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String showWelcome()
	{
		System.out.println("entering showWelcome");
		return "index";
	}

}
