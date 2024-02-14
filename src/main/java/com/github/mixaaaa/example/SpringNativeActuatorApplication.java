package com.github.mixaaaa.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringNativeActuatorApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringNativeActuatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeActuatorApplication.class, args);
	}

	@Bean
	public ApplicationRunner webEndpointProperties(WebEndpointProperties webEndpointProperties) {
		return args -> logger.info("WebEndpointProperties: {}", webEndpointProperties);
	}

}
