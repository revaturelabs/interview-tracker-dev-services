package com.example.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepoTest {

	@Autowired
	private UserRepo userRepo;
	
	@Test
	public void saveAndThenCallNumberOfUsers() 
	{
		userRepo.save(new User(1,"Nameuser","wordpass"));
		userRepo.save(new User(2,"I","Phone"));
		userRepo.save(new User(3,"Whatis","sleep"));
		List<User> list = (List<User>) userRepo.findAll();
		
		assertThat(list.size()).isEqualTo(3);
	}

}
