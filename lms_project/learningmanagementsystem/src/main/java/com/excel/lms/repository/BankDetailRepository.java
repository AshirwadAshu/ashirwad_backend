package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeeSecondaryInfo;


public interface BankDetailRepository extends JpaRepository<BankDetails,Integer> {



	Optional<BankDetails> findByBankDetailsId(Integer bankDetailsId);
	
	

	

}
