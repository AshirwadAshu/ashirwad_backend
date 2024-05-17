package com.excel.lms.dto;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeExperience;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.enums.Designation;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	
	
	private List<EmployeePrimaryInfo>employeePrimaryInfos;

}
