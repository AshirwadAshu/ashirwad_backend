package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentInfo {
	@Id
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String age;
	private LocalDate dob;
	private String address;

}
