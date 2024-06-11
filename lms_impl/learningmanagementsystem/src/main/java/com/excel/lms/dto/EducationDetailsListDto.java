package com.excel.lms.dto;

import java.util.List;
import java.util.Optional;

import com.excel.lms.entity.EmployeePrimaryInfo;
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
public class EducationDetailsListDto {
	
	
	private String EmployeeId;
	
	private List<EducationDetailsDto>educations;


}
