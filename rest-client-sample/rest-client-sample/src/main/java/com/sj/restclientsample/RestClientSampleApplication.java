package com.sj.restclientsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class RestClientSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientSampleApplication.class, args);
	}
	@Bean

	public RestClient restClient(){
		return RestClient.builder()

			.baseUrl("https://jsonplaceholder.typicode.com")
			.build();

	}

}
