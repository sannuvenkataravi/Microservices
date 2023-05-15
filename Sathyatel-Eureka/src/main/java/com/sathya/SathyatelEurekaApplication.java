package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SathyatelEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SathyatelEurekaApplication.class, args);
	}

}

