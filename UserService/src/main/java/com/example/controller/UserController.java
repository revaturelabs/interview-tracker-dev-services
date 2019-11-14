package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

import feign.RequestLine;

@RestController
public class UserController {

	@GetMapping(value="/users")
	public User getAll() {
		return new User(1,"bodhi", "bacon");
	}
	
//	@RequestLine("GET /users/{id}")
//	public User findById(@PathVariable("id") int id);
	
	
}
