package com.excel.spring_hibernate.orm.dao;

import java.util.List;

import com.excel.spring_hibernate.orm.Student;



public interface StudentDao { 
     int insertStudent(Student student);
    
    Student getStudent(int id); 
    
    Student updateStudent(Student student);
	 Student deleteStudent(int id);
	 List<Student> selectAllStudents();
    	
    
}