package com.example.cicddemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/")
	public String welcome() {
		return "WELCOME TO EPSILON- TAME TO BADA KHUSS HOVE";
	}
}
