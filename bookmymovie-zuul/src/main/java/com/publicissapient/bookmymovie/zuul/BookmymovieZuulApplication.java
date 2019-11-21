package com.publicissapient.bookmymovie.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookmymovieZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmymovieZuulApplication.class, args);
	}

}
