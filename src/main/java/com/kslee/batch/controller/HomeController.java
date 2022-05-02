package com.kslee.batch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/index")
	public String test() {
		return "aaa";
				
	}
	
	@RequestMapping("/index2")
	public String aa() {
		return "aaa111";
				
	}
}
