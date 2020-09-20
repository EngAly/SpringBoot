package com.techepic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EndpointTasksInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointTasksInterviewApplication.class, args);
	}

	@GetMapping("/")
	public String Hello() {
		return "Hello World In Spring";
	}
}