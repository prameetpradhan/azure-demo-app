package com.prameet.azuredemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDemoAppApplication {

	@GetMapping
	public String getMessage() {
		return "Congrats! Its you firts azure webapp.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoAppApplication.class, args);
	}

}
