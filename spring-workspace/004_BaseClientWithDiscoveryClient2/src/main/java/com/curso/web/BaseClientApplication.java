package com.curso.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BaseClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseClientApplication.class, args);
	}
}
