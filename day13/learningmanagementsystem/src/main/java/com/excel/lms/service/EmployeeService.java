package com.excel.lms.service;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeeSecondaryInfo;

public interface EmployeeService {

	
	public String savePrimary(EmployeePrimaryInfoDto dto);
	
	public String saveSecondary(EmployeeSecondaryInfoDto dto);
	
	public String saveBankInfo(BankDetailsDto dto);;
}
