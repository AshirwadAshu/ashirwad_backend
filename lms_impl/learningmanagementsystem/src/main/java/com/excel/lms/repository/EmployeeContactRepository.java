package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeExperience;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContact, Integer> {

	

	
}
