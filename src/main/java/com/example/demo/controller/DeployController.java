package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
	@GetMapping("/msg")
	public String getMessage() {
		return "Hello Prayas!!";
	}

}
