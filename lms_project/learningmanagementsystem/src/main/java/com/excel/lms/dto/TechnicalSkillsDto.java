package com.excel.lms.dto;

import java.util.List;

import com.excel.lms.entity.EmployeePrimaryInfo;

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
public class TechnicalSkillsDto {
	
	private Integer TechnicalSkillsId ;
	
	private String skillType;
	private String skillRating;
	private Integer yearOfexperience;
	
	


}
