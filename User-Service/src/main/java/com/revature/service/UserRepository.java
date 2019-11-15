package com.revature.service;

<<<<<<< HEAD

import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.model.UserBean;

=======
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
>>>>>>> brittany


@Repository
public interface UserRepository extends CrudRepository<UserBean, Integer> {

	
}
