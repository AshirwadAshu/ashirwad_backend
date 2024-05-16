package com.excel.lms.entity;

import java.time.LocalDate;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.Gender;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer primaryId;
	
	private String employeeid;
	private String employeeName;
	private LocalDate dateOfJoing;
	private LocalDate dateOfbirth;
	private String email;
	private String bloodGroup;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	@Enumerated(EnumType.STRING)
	private Gender gender ;
	
	private String nationality;
	private String employeeStatus;

}
