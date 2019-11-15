package com.revature.controller;


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
	
	
	/**
	 * <p>Create User Method</p>
	 * @author Brittany Tinnin
	 */
	@GetMapping(value = "/create")
    public void save() {
		UserBean user = new UserBean(0, "anotherU", "pass");
        repository.save(user);
    }
	
	/**
	 * <p>Login Method</p>
	 * @author Brittany Tinnin
	 * @param user the user information from logging in
	 * @return the user information after username is verified
	 */
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
	
	/**
	 * <p>Find all users Method</p>
	 * @author Brittany Tinnin
	 * @return a list of all users
	 */
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
