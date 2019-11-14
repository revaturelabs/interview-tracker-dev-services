package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.UserRepo;

@Service
public class ServiceLayer 
{
	@Autowired
	private UserRepo ur;
}
