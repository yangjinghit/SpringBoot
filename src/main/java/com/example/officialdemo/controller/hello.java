package com.example.officialdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {
	
	@ResponseBody
	@RequestMapping("hello")
	String printHello() {
	
		return "hello world";
	
	}

}
