package com.excel.spring.jdbc.dao;



import com.excel.spring.jdbc.entity.Student;

public  interface StudentDao {
	
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudent(Student student);
	
	
	
	

}
