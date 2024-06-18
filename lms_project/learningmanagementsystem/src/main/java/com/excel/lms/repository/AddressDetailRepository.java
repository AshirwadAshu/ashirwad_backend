package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.entity.AddressDetails;

public interface AddressDetailRepository extends JpaRepository<AddressDetails, Integer> {

	Optional<AddressDetails> findByEmployeePrimaryInfoEmployeeIdAndAddressDetailsId(String employeeId,
			Integer addressDetailsId);
	Optional<AddressDetails> findByAddressDetailsId(Integer addressDetailsId);
	Optional<AddressDetails> findByEmployeePrimaryInfoEmployeeIdAndAddressDetailsIdAndDoorNo(String employeeId,
			Integer addressDetailsId, String doorNo);
	
}
