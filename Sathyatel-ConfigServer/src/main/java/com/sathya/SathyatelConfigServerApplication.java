package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SathyatelConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SathyatelConfigServerApplication.class, args);
	}

}

