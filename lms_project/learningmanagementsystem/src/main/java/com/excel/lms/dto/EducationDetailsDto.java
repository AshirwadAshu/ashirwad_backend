package com.excel.lms.dto;


import com.excel.lms.enums.Education;


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
	
	private Integer educationDetailsId ;
	
	private String employeeId;
	private Education educationType;
	
	private String yearOfpassing;
	private Double percentage;
	private String universityName;
	private String instuteName;
	private String specialization;
	private String state;
	

	
}
