package com.excel.lms.service;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeeContactListDto;
import com.excel.lms.dto.EmployeeExperienceDto;
import com.excel.lms.dto.EmployeeExperienceListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeeSecondaryInfo;

public interface EmployeeService {

	
	public String savePrimary(EmployeePrimaryInfoDto dto);
	
	public String saveSecondary(EmployeeSecondaryInfoDto dto);
	
	public String saveBankInfo(BankDetailsDto dto);

	public String saveEducationInfo(EducationDetailsListDto dto);

	public String saveAddressInfo(AddressDetailsListDto dto);

	public String saveExperienceInfo(EmployeeExperienceListDto dto);

	public String saveContactInfo(EmployeeContactListDto dto);

	public String addSkills(TechnicalSkillsListDto dto);
}
