package com.phayao.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableGlobalMethodSecurity
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@RestController
class GreetingController {
	
	@RequestMapping("/")
	Greet greet() {
		return new Greet("Hello World!");
	}
}

class Greet {
	private String message;
	
	public Greet() {}
	
	public Greet(String message) {
		this.setMessage(message);		
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
