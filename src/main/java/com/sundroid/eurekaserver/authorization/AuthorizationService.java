package com.sundroid.eurekaserver.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class AuthorizationService {
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "authorization-server");
		SpringApplication.run(AuthorizationService.class, args);
	}

}
