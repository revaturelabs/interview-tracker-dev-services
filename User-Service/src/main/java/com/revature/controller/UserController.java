package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserBean;
import com.revature.service.UserRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/users")
public class UserController {


	private UserRepository repository;


	List<UserBean> list;

	


	
	/**
	 * Created by Brittany Tinnin and William Liederer
	 * Very basic method to save a user to database
	 * @return
	 */
	 @GetMapping(value = "/users")
	    public String save() {
	        UserBean dev = new UserBean(2,"admin","admin");
	        repository.save(dev);
	        return "worked";
	    }
	 

	
	
	

	@PostMapping(value="/login")
	public @ResponseBody UserBean login(@RequestBody UserBean user) {
		System.out.println(user);
		for(UserBean u : repository.findAll()) {
			System.out.println(user);
			if(user.getUsername().equals(u.getUsername())) {
				return u;
			}
		}
		return null;
	}
	
	@GetMapping(value="/allusers")
	public Iterable<UserBean> findAll() {
		return repository.findAll();
	}
	

	public UserRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	

}
