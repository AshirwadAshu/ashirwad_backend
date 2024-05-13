package com.excel.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/spring/collection/config.xml");
	
	Employee employee = (Employee)context.getBean("employee");
	
	System.out.println(employee.getName());
	System.out.println(employee.getPhones());
	System.out.println(employee.getSkills());
	System.out.println(employee.getNominees());
	
	}

}
