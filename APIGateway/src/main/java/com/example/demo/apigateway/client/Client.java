package com.example.demo.apigateway.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Client {

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
