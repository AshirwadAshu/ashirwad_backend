package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeExperience;


public interface EmployeeExperienceRepository  extends JpaRepository<EmployeeExperience,Integer> {
	
	Optional<EmployeeExperience>findByEmployeePrimaryInfoEmployeeIdAndEmployeeExperienceId(String employeeId,Integer employeeExperienceId);

	Optional<EmployeeExperience> findByEmployeeExperienceId(Integer employeeExperienceId);

}
