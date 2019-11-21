package com.sapient.auth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication(scanBasePackages = { "com.sapient.auth.*" })
@EnableJpaRepositories("com.sapient.auth.repository")
@EntityScan("com.sapient.auth.model")
@EnableAuthorizationServer
@EnableEurekaClient
public class AuthServerApplication {

	private static final Logger log = LoggerFactory.getLogger(AuthServerApplication.class);

	public static void main(String[] args) {
		log.debug("Starting Authentication Server......");
		SpringApplication.run(AuthServerApplication.class, args);
	}
}
