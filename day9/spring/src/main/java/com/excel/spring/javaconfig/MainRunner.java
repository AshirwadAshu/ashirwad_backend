package com.excel.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student = context.getBean("student",Student.class);
		student.study();
		
	}

}
