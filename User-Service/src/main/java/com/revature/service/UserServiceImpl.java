package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.revature.model.UserBean;

@Service
//@Component
public class UserServiceImpl {
	
	
	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	private UserRepository repository;

//	@GetMapping("/create")
//	public String bulkcreate(){
//	// save a single Customer
//	repository.save(new UserBean(1, "Rajesh", "Bhojwani"));
//	return "Customers are created";
//	}
	
	
	
	public UserRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	
	

}
