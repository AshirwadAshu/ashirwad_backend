package com.example.demo.service;

import com.example.demo.dto.StudentInfoDto;
import com.example.demo.entity.StudentInfo;

public interface StudentService {

	Integer saveStudent(StudentInfoDto dto);

	StudentInfoDto getAllStudent(StudentInfoDto dto);

	Integer updateStudent(StudentInfoDto dto) ;





	String verify(StudentInfo stud);

	Object getAllStudents();
}
