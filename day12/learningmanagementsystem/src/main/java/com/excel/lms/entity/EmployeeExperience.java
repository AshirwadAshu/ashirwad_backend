package com.excel.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
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
@Table(name = "employee_experience_info")
public class EmployeeExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer EmployeeExperienceId ;
	
	private String companyName;
	private Integer yearOfexperience;
	private LocalDate dateOfJoing;
	private LocalDate dateOfReliving;
	private String desgnation;
	private String location;
	
	
}
