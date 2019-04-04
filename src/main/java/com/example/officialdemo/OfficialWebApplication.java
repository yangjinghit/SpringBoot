package com.example.officialdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ImportResource(locations = {"classpath:spring.xml"})
@SpringBootApplication
public class OfficialWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficialWebApplication.class, args);
	}

}
