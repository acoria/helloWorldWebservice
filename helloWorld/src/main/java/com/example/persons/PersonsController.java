package com.example.persons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonsController {
	
	@GetMapping("/persons")
	public String getPerson() {	
		return "Test";
	}
	
}
