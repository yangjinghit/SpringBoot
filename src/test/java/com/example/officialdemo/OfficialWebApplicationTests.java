package com.example.officialdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.officialdemo.entity.Student;
import com.example.officialdemo.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OfficialWebApplicationTests {

	Logger logger = LoggerFactory.getLogger(OfficialWebApplicationTests.class);

	@Autowired
	Student student;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void contextLoads() {

		System.out.println(student.toString());
	}

	@Test
	public void test() {
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		System.out.print(studentService + "========");
		logger.info("afdafsafsafasfaf==========dfafas");
	}

}
