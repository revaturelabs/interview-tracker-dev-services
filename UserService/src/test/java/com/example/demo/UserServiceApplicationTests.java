package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {
	private UserClient uc;
	@Test
	void contextLoads() {
		User user = uc.getUser(0);
		assertEquals("Username", user.getUsername());
	}

}
