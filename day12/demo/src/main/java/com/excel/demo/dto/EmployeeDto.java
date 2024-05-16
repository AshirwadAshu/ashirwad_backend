package com.excel.demo.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
	private  Integer id ;
	private String firstname;
	private String lastname;
	private String mobileNo;
	private String aadhar;
	private String panNo;
	private String employee;

}
