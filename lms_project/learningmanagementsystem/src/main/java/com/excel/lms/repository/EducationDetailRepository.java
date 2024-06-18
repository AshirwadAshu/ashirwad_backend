package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.dto.EducationDetailsDto;
import com.excel.lms.entity.EducationDetails;

public interface EducationDetailRepository extends JpaRepository<EducationDetails, Integer> {

	Optional<EducationDetails> findByEmployeePrimaryInfoEmployeeIdAndEducationDetailsId(String employeeId,Integer educationDetailsId);

	Optional<EducationDetails> findByEducationDetailsId(Integer educationDetailsId);

}
