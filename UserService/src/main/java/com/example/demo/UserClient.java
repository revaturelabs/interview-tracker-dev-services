package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.User;

import feign.RequestLine;

@FeignClient("users")
public interface UserClient extends JpaRepository<User, Integer> {

//	 	@RequestLine("GET /{isbn}")
//	    BookResource findByIsbn(@Param("isbn") String isbn);
//	 
//	    @RequestLine("GET")
//	    List<BookResource> findAll();
//	 
//	    @RequestLine("POST")
//	    @Headers("Content-Type: application/json")
//	    void create(Book book);
//	    
//	    @RequestMapping(method = RequestMethod.GET, value = "/stores")
//	    List<Store> getStores();
//
//	    @RequestMapping(method = RequestMethod.POST, value = "/stores/{storeId}", consumes = "application/json")
//	    Store update(@PathVariable("storeId") Long storeId, Store store);
	
	@RequestLine("GET /users")
	List<User> findAll();
	
//	User findById();
	@RequestLine("GET /users/{id}")
	User findById(@PathVariable("id") int id);
//	User getUser(@PathVariable("id") int id);
	
	@RequestLine("POST")
	void create(User user);
	
	@RequestLine("POST /users/{id}")
	User update(@PathVariable("id") int id, User user);
	
}
