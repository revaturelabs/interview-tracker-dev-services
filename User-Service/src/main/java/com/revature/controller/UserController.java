package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserBean;
import com.revature.service.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	
	List<UserBean> list;
	
	@GetMapping(value="/getUsers")
	public UserBean getAll() {
		list.add(new UserBean(1, "bodhi", "bacon"));
		list.add(new UserBean(2, "mike", "jordan"));
		list.add(new UserBean(3, "tarzan", "jungle"));
		return new UserBean(1, "bodhi", "bacon");
		
	}
	
	 @GetMapping(value = "/users")
	    public String save() {
	        UserBean dev = new UserBean(2,"admin","admin");
	        repository.save(dev);
	        return "worked";
	    }
	
	
	
	
}
