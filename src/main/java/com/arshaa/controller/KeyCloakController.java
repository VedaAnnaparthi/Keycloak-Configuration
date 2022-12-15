package com.arshaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keycloak")
public class KeyCloakController {

	@GetMapping("/test")
	public String testapi () {
		return "This api is for testing purpose";
	}
	
}
