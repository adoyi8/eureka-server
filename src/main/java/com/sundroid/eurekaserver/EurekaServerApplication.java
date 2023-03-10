package com.sundroid.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class EurekaServerApplication {

	public static void main(String[] args) {


		System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
