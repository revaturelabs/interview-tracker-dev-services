package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> brittany
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
<<<<<<< HEAD
	
	private UserRepository repository;
	
	public UserRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	List<UserBean> list;
	
	@GetMapping(value="/getUsers")
	public UserBean getAll() {
		list.add(new UserBean(1, "bodhi", "bacon"));
		list.add(new UserBean(2, "mike", "jordan"));
		list.add(new UserBean(3, "tarzan", "jungle"));
=======

	private UserRepository repository;


	List<UserBean> list;

	@GetMapping(value = "/users")
	public UserBean getUser() {
//		list.add(new UserBean(1, "bodhi", "bacon"));
//		list.add(new UserBean(2, "mike", "jordan"));
//		list.add(new UserBean(3, "tarzan", "jungle"));
>>>>>>> brittany
		return new UserBean(1, "bodhi", "bacon");
		
	}
	
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
	 
//	 @GetMapping(value="/login")
//	 public String login() {
//		 repository.
//	 }
	
	
	
	
	
	@GetMapping(value = "/create")
    public void save() {
		UserBean user = new UserBean(0, "anotherU", "pass");
        repository.save(user);
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
