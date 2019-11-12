package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("users")
public interface UserLoginProxy {

}
