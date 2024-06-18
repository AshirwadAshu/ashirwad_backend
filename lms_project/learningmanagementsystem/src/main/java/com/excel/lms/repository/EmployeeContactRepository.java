package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeExperience;

public interface EmployeeContactRepository extends JpaRepository<EmployeeContact, Integer> {

	Optional<EmployeeContact> findByEmployeePrimaryInfoEmployeeIdAndContactId(String employeeId , Integer contactId);

	Optional<EmployeeContact> findByContactId(Integer contactId);

	
}
