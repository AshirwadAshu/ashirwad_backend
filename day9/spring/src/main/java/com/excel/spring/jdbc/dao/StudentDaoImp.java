package com.excel.spring.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.excel.spring.jdbc.entity.Student;
@Component("studentDao")
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertStudent(Student student) {
		String query="insert into Student(id,name,city) Values(?,?,?)";
		return jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
			
	}
	@Override
	public int updateStudent(Student student) {
	String query1="update Student set name=?,city=? where id=?";
		return jdbcTemplate.update(query1,student.getName(),student.getCity(),student.getId());
	}

	@Override
	public int deleteStudent(Student student) {
		String query2="delete from Student where id=?";
		
		return jdbcTemplate.update(query2,student.getId());
	}
	
	
	
	}


