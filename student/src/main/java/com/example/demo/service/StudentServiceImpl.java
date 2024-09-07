package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.constant.ApplicationConstants;
import com.example.demo.dto.StudentInfoDto;
import com.example.demo.entity.StudentInfo;
import com.example.demo.exception.StudentException;
import com.example.demo.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository studentRepository;
	
	private final AuthenticationManager authenticationManager;
	
    private final JwtService jwtService;
	
	@SuppressWarnings("unused")
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public Integer saveStudent(StudentInfoDto dto) {
		Optional<StudentInfo> optional = studentRepository.findByEmail(dto.getEmail());

		if (optional.isPresent()) {
			return null;
		} else {
			String encodedPassword = encoder.encode(dto.getPassword());

			StudentInfo studentInfo = StudentInfo.builder()

					.studentId(dto.getStudentId()).firstName(dto.getFirstName()).lastName(dto.getLastName())
					.email(dto.getEmail()).password(encodedPassword).age(dto.getAge()).dob(dto.getDob())
					.address(dto.getAddress()).build();

			studentRepository.save(studentInfo);
		}

		return 1;
	}

	@Override
	public StudentInfoDto getAllStudent(StudentInfoDto dto) {
		Optional<StudentInfo> optional = studentRepository.findByEmail(dto.getEmail());
		if (optional.isPresent()) {
			StudentInfo studentInfo = optional.get();

			return StudentInfoDto.builder().studentId(studentInfo.getStudentId()).firstName(studentInfo.getFirstName())
					.lastName(studentInfo.getLastName()).email(studentInfo.getEmail())
					.password(studentInfo.getPassword()).age(studentInfo.getAge()).dob(studentInfo.getDob())
					.address(studentInfo.getAddress())

					.build();
		}
		return null;
	}

	@Override
	public Integer updateStudent(StudentInfoDto dto) {
		Optional<StudentInfo> optional = studentRepository.findByEmail(dto.getEmail());
		if (optional.isPresent()) {
			StudentInfo studentInfo = optional.get();

			StudentInfo info = StudentInfo.builder()
					.firstName(dto.getFirstName())
					.lastName(dto.getLastName())
					.build();

			studentInfo.setFirstName(info.getFirstName());
			studentInfo.setLastName(info.getLastName());
			
			studentRepository.save(studentInfo).getEmail();
			
			return 1;

		} else {
			throw new StudentException(ApplicationConstants.STUDENT_NOT_FOUND);
		}
	}
	
	@Override
	public List<StudentInfo> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public String verify(StudentInfo stud) {
		Authentication authentication =  authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(stud.getEmail(),stud.getPassword()));
		
		if(authentication.isAuthenticated())
			return jwtService.generateToken(stud.getEmail());
	       
		
		return "fail";
		
	}







}
