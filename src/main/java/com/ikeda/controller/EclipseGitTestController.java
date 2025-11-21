package com.ikeda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EclipseGitTestController {
	
	@GetMapping(value = "/sample")
	public String method() {
		return "dispTest";
	}

}
