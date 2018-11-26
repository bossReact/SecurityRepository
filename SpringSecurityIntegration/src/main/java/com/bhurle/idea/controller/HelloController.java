package com.bhurle.idea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/hello")
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController");
	}
	
/*	@GetMapping(value="/yep")
	public String getHello() {
		return "Yep u r in helloController";
	}
*/
}
