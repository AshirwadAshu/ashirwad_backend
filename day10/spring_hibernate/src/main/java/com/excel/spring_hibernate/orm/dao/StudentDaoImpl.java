package com.excel.spring_hibernate.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.excel.spring_hibernate.orm.Student;




@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private HibernateTemplate hibTemplate;

	
	public void sethTemplate(HibernateTemplate hibTemplate) { 
        this.hibTemplate = hibTemplate; 
    } 
	
	@Override
	@Transactional
	public int insertStudent(Student student) {
		
		String query = "insert into student (id,name,city) values (?,?,?)";
		return (int) hibTemplate.save(student);
	}

	@Override
	public Student getStudent(int id) {
		Student student = this.hibTemplate.get(Student.class,id);
		return student;
	}

	@Transactional
	@Override
	public Student updateStudent(Student student) {
			String update="update Student set name=? where id=?";
		hibTemplate.saveOrUpdate(student);
		return student;
	}
	
	

	@Transactional
	public Student deleteStudent(int id) {
		Student del	= hibTemplate .get(Student.class,id);
		hibTemplate.delete(del);
		return del;

	}

	@Override
	public List<Student> selectAllStudents() {
		List<Student> students=hibTemplate.loadAll(Student.class);
		return students;
	}
	
	
	

}


