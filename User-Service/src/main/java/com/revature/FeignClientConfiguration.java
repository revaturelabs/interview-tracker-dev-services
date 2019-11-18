package com.revature;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.core.codec.Encoder;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

public class FeignClientConfiguration {
	
	public Encoder feignEncoder() {
	    HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();
	    ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);
	    return new SpringEncoder(objectFactory);
	}

}
