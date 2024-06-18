package com.excel.lms.dto;

import java.time.LocalDate;

import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.enums.ContactType;
import com.excel.lms.enums.Designation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class EmployeeExperienceDto {

	private Integer employeeExperienceId ;
	private String employeeId;
	private String companyName;
	private String yearOfexperience;
	private LocalDate dateOfJoing;
	private LocalDate dateOfReliving;
	
	
	private Designation desgnation;
	
	private String location;
	
}
