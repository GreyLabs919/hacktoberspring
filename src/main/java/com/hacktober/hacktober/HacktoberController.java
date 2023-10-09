package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class HacktoberController {
    private String hacktoberProfileUrl = "https://hacktoberfest.com/profile/"

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/profile")
	public ResponseEntity<String> profile() {
		return ResponseEntity.status(302).location(this.hacktoberProfileUrl);
	}

	@GetMapping("/error")
	public String error() {
		return "Oops!";
	}

}