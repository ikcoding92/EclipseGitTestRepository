package com.ikeda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EclipseGitTestController {
	
	@GetMapping(value = "/sample")
	public String method() {
		return "Test Text Hello";
	}

}
