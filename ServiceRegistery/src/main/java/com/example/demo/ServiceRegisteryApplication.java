package com.example.demo;



   

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

<<<<<<< HEAD

=======
>>>>>>> brittany
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisteryApplication.class, args);
	}

}
