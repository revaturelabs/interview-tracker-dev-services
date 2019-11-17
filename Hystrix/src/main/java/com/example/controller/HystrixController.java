package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class HystrixController {
	
	@RequestMapping(value = "/")
	@HystrixCommand(fallbackMethod = "fallback_serverdown", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
			})
	public String hys() throws InterruptedException {
	      Thread.sleep(3000);
	      return "Hystrixxxx";
	   }
	
	private String fallback_serverdown() {
		   return "Request fails. It takes long time to response";
		}

}