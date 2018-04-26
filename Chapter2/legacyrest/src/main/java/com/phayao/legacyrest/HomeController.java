package com.phayao.legacyrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public Greet SayHello() {
		return new Greet("Hello World!");
	}
	
	class Greet {
		private String message;
		
		public Greet(String message) {
			this.setMessage(message);
		}
		// add getter and setter
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}
	
}
