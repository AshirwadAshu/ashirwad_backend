package com.excel.spring_hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.spring_hibernate.orm.Student;
import com.excel.spring_hibernate.orm.dao.StudentDao;



/**
 * Hello world!
 *
 */
public class App 
{
 public static void main( String[] args ) {
   
ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		StudentDao dao = context.getBean("studentDao",StudentDao.class);
		Student s = new  Student();
		s.setId(2);
		s.setName("raju");
		s.setCity("mandaya");
		
//		 int i = dao.insertStudent(s);
//		System.out.println( i);
		
//	Student student	= dao.getStudent(2);
//	System.out.println(student);
		
		
//		
//		Student update=dao.updateStudent(s);
//		System.out.println(update);
		
		
//		Student stu	=dao.deleteStudent(2);
//				System.out.println(stu);
	
		List<Student> students=dao.selectAllStudents();
				for(Student s1:students) {
					System.out.println(s1);
		
		
    }
 }
}
