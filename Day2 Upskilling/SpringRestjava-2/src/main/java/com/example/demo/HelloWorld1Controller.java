package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld1Controller {
		//GET HTTP Method
		//http://localhost:8080/hello-world
		@GetMapping("/hello-world")
		public String helloWorld() {
			return "Hello World!";
			
		}

	}


