package com.nt.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppIntegrationWithJenkinsNDockerApplication {

	@GetMapping("/wishMsg")
	public String getMsg() {
		System.out.println("Welcome to India");
		return "Welcome To Docker App";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerAppIntegrationWithJenkinsNDockerApplication.class, args);
	}

} 
