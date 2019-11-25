package com.publicissapient.bookmymovie.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookmymovieEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmymovieEurekaApplication.class, args);
	}

}
