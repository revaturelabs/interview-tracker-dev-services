package com.revature;

import org.springframework.cloud.openfeign.FeignClient; 
import org.springframework.data.repository.CrudRepository;

import com.revature.model.UserBean;

@FeignClient(value="user-service", url="http://localhost:9003/")
public interface RevatureFeignClient extends CrudRepository<UserBean, Integer>{

}
