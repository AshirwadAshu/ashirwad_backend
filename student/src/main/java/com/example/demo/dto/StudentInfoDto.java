package com.example.demo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentInfoDto {
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String age;
	private LocalDate dob;
	private String address;

}
