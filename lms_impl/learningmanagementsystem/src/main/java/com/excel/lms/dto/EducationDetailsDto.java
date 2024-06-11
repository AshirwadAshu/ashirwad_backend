package com.excel.lms.dto;

import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.enums.Education;

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
public class EducationDetailsDto {
	
	private Integer EducationDetailsId ;
	
	private String employeeId;
	private Education educationType;
	
	private String yearOfpassing;
	private Double percentage;
	private String universityName;
	private String instuteName;
	private String specialization;
	private String state;
	

	private EmployeePrimaryInfo employeePrimaryInfo;
}
