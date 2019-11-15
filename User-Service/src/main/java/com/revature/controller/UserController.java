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
@CrossOrigin(origins = "*")
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;

	/**
	 * <p>Very basic method to save a user to database</p>
	 * 
	 * @author William Liederer and Brittany Tinnin
	 */
	 @GetMapping(value = "/users")
	    public String save() {
	        UserBean dev = new UserBean(2,"admin","admin");
	        repository.save(dev);
	        return "worked";
	    }

	/**
	 * <p>
	 * Login Method
	 * </p>
	 * 
	 * @author Brittany Tinnin
	 * @param user the user information from logging in
	 * @return the user information after username is verified
	 */
	@PostMapping(value = "/login")
	public @ResponseBody UserBean login(@RequestBody UserBean user) {
		for (UserBean u : repository.findAll()) {
			if (user.getUsername().equals(u.getUsername())) {
				return u;
			}
		}
		return null;
	}

	/**
	 * <p>
	 * Find all users Method
	 * </p>
	 * 
	 * @author Brittany Tinnin
	 * @return a list of all users
	 */
	@GetMapping(value = "/allusers")
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
