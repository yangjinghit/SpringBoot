package com.example.officialdemo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionController {
	
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> exception(Exception e){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -1);
		map.put("msg", e.getMessage());
		return map;
		
		
	}
	
	@ResponseBody
	@ExceptionHandler(value = BusinessException.class)
	public Map<String, Object> exception(BusinessException e){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", e.getCode());
		map.put("msg", e.getMessage());
		return map;
		
		
	}

}
