package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filters.PostFilter;
import com.example.filters.PreFilter;

@Configuration
public class ZuulConfig {

	@Bean
	public PreFilter makePre() {
		return new PreFilter();
	}
	@Bean
	public PostFilter makePost() {
		return new PostFilter();
	}
}

