package com.example.officialdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.officialdemo.exception.BusinessException;

@Controller
public class hello {
	
	@ResponseBody
	@RequestMapping("hello")
	public String printHello() throws BusinessException {
		//int a = 1/0;
		
		throw new BusinessException("401", "no authrosized");
		//return "hello world";
	
	}

}
