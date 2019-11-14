package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.model.User;

@SpringBootTest
class UserServiceApplicationTests {
	private UserClient uc;
	@Test
	void contextLoads() {
		User user = uc.findById(0);
		assertEquals("Username", user.getUsername());
	}
	@Test
	void testGetAll() {
		List<User> user = uc.findAll();
		assertTrue(user.size()>0);
	}
}
