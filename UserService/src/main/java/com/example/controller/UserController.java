package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {

	@GetMapping(value="/users")
	public User getAll() {
		return new User(1,"bodhi", "bacon");
	}
	
	
}
