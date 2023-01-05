package com.example.springbootsba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling
public class SpringbootSbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSbaApplication.class, args);
	}

}
