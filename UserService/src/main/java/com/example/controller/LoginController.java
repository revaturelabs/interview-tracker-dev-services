package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class LoginController {
	
	 List<User> list;

	    @GetMapping(value="/users")
	    public List<User> getAll() {
	        list = new ArrayList<User>();
	        list.add(new User(1, "bodhi", "bacon"));
	        list.add(new User(1, "seacriest", "scrum"));
	        
	        return list;
	    }

}
