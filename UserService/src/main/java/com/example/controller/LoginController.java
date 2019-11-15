package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LoginController {
	
	 List<User> list;
	 	@HystrixCommand(fallbackMethod = "fallbackGetAll")
	    @GetMapping(value="/users")
	    public List<User> getAll() {
	        list = new ArrayList<User>();
	        list.add(new User(1, "bodhi", "bacon"));
	        list.add(new User(1, "seacriest", "scrum"));
	        
	        return list;
	    }
	 	
	 	 public List<User> fallbackGetAll(){
	 		 list = new ArrayList<User>();
	 		list.add(new User(0, "", ""));
	 		 return list;
	 	 }

}
