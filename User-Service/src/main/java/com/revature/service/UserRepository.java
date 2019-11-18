package com.revature.service;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.UserBean;

<<<<<<< HEAD


=======
/**
 * 
 * @author Brittany Tinnin and Will Liederer
 * 
 * <p>The custom User Repository interface extends the Crud Repository Interface for generic CRUD operation</p>
 */
>>>>>>> LoginFeature
@Repository
public interface UserRepository extends CrudRepository<UserBean, Integer> {

	
}
