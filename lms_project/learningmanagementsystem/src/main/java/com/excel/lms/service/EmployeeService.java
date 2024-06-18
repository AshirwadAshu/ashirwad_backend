package com.excel.lms.service;

import java.util.List;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EducationDetailsDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.dto.EmployeeContactListDto;
import com.excel.lms.dto.EmployeeExperienceDto;
import com.excel.lms.dto.EmployeeExperienceListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EducationDetails;
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

	public List<AddressDetailsDto> getAddressById(AddressDetailsDto dto);

	public List<EducationDetailsDto> saveEducation(EducationDetailsListDto dto);

	public List<EmployeeExperienceDto> getExperience(EmployeeExperienceListDto dto);

	public List<EmployeeContactDto> getAllContact(EmployeeContactListDto dto);

	public List<TechnicalSkillsDto> getAllSkills(TechnicalSkillsListDto dto);

	//public String updateAddress(AddressDetailsListDto dto);

	public String updateEmployeeAddress(AddressDetailsDto dto);

	public String updateEducation(EducationDetailsDto dto);

	public String updateEmployeeExperience(EmployeeExperienceDto dto);

	public String updateEmployeeContact(EmployeeContactDto dto);

	public String deleteAddress(AddressDetailsDto dto);

	public String deleteExperience(EmployeeExperienceDto dto);

	public String deleteEmployeeEducation(EducationDetailsDto dto);

	public String deleteContact(EmployeeContactDto dto);

	public EmployeePrimaryInfoDto getPrimary(EmployeePrimaryInfoDto dto);

	public String updatePrimaryinfo(EmployeePrimaryInfoDto dto);

	public void deleteEmployee(EmployeePrimaryInfoDto dto);

	public List<EmployeeSecondaryInfoDto> getAllSecondary();

	public String updateSecondaryInfo(EmployeeSecondaryInfoDto dto);

	public String deleteSecondaryInfo(EmployeeSecondaryInfoDto dto);

	public List<BankDetailsDto> getBankDetails(BankDetailsDto dto);

	public String updateBankDetails(BankDetailsDto dto);

	public String deleteBankDetails(BankDetailsDto dto);

	

//	public List<EmployeeSecondaryInfoDto> getAllSecondary(EmployeeSecondaryInfoDto dto);



	
}
