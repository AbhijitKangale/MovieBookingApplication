package com.sapient.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserServiceConfigurations {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
