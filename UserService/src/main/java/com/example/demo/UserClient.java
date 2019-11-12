package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("users")
public interface UserClient {

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
	
	List<User> findAll();
	
//	User findById();
	User getUser(@PathVariable("id") int id);
	
	void create(User user);
	
	User update(User user);
	
}
