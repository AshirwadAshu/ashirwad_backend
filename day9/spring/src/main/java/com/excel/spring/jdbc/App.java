package com.excel.spring.jdbc;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.excel.spring.jdbc.dao.StudentDao;
import com.excel.spring.jdbc.entity.Student;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		
		System.out.println(dao);
		
		
//		int res = dao.updateStudent(new Student(123,"raju","mysore"));
//			System.out.println(res);
		
		
//		student .setId(123);
//		int del=dao.deleteStudent(student );
//		System.out.println(del);
	}

}
