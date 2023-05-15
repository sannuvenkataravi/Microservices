package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SathyatelFriendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SathyatelFriendApplication.class, args);
	}

}

