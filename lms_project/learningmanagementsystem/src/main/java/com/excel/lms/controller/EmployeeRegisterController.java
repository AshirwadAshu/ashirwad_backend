package com.excel.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.service.EmployeeService;

@RestController
@RequestMapping(path = "/api/v1/employee", method = { RequestMethod.POST, RequestMethod.PUT })
public class EmployeeRegisterController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(path = "/pinfo")
	private ResponseEntity<String> postEmployeeData(@RequestBody EmployeePrimaryInfoDto dto) {
		String employeeId = employeeService.savePrimary(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@GetMapping("/getallpinfo")
	public ResponseEntity<EmployeePrimaryInfoDto> getAllEmployee(@RequestBody EmployeePrimaryInfoDto dto){
	EmployeePrimaryInfoDto	employeePrimary = employeeService.getPrimary(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeePrimary);
	}
	
	@PutMapping("/updatepinfo")
	public ResponseEntity<String> updatePrimaryinfo(@RequestBody EmployeePrimaryInfoDto dto){
	String updatePrimaryinfo = employeeService.updatePrimaryinfo(dto);
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(updatePrimaryinfo);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeePrimaryInfoDto dto){
      employeeService.deleteEmployee(dto);
	return null;
	}
	
//-------------------------------[Employee secondary Info]-------------------------------------------------------------
	
	
	@PostMapping(path="/sinfo")
	public ResponseEntity<String> postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto){
		
		String employeeId = employeeService.saveSecondary(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
		
	}
	
	@GetMapping(path = "/getAllSinfo")
	public ResponseEntity<List<EmployeeSecondaryInfoDto>> getAllSecondary(){
	List<EmployeeSecondaryInfoDto> secondaryString	= employeeService.getAllSecondary();
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(secondaryString);
	}
	
	@PutMapping(path = "/updateSinfo")
	public ResponseEntity<String> updateSinfo(@RequestBody EmployeeSecondaryInfoDto dto){
	String secondaryString	= employeeService.updateSecondaryInfo(dto);
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(secondaryString);
	}
	
	@DeleteMapping(path = "/deleteSinfo")
	public ResponseEntity<String> deleteSinfo(@RequestBody EmployeeSecondaryInfoDto dto){
		String secondaryString = employeeService.deleteSecondaryInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(secondaryString);
	}
	
	
	
	
	
//	@GetMapping(path = "/getAllSinfo")
//	public ResponseEntity<List<EmployeeSecondaryInfoDto>> getAllSecondary(@RequestBody EmployeeSecondaryInfoDto dto){
//	List<EmployeeSecondaryInfoDto> secondaryString	= employeeService.getAllSecondary(dto);
//	return ResponseEntity.status(HttpStatus.ACCEPTED).body(secondaryString);
//	}
	
	
//----------------------------[Employee BankDetails]-------------------------------------------------------------------------------------
	
	
	
	@PostMapping(path="/binfo")
	public ResponseEntity<String> postBankInfo(@RequestBody BankDetailsDto dto){
		String employeeId = employeeService.saveBankInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);	
	}
	
	@GetMapping(path = "/getAllBankInfo")
	public ResponseEntity<List<BankDetailsDto>> getBankdeatails(@RequestBody BankDetailsDto dto){
		List<BankDetailsDto> bankdetails = employeeService.getBankDetails(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(bankdetails);
	
	}
	
	@PutMapping(path = "/updateBank")
	public ResponseEntity<String> updateBank(@RequestBody BankDetailsDto dto){
		String bankString = employeeService.updateBankDetails(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(bankString);
	}
	
	@DeleteMapping(path = "/deleteBank")
	public ResponseEntity<String> deleteBankInfo(@RequestBody BankDetailsDto dto){
	String bankString	= employeeService.deleteBankDetails(dto);
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(bankString);
	}
	
//--------------------------[Employe Education]-----------------------------------------------------------------------
	
	@PostMapping(path = "/eduinfo")
	
	public ResponseEntity<String> postEducationInfo(@RequestBody EducationDetailsListDto dto){
		String employeeId	= employeeService.saveEducationInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@GetMapping(path ="/getEducation")
	public ResponseEntity<List<EducationDetailsDto>> getEducation(@RequestBody EducationDetailsListDto dto){
		List<EducationDetailsDto> detailsDtos = employeeService.saveEducation(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(detailsDtos);
	}
	
	@PutMapping(path = "/updateEducation")
	public ResponseEntity<String> updateAddress(@RequestBody EducationDetailsDto dto){
		String employeeString = employeeService.updateEducation(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeString);
	}
	
	@DeleteMapping(path = "/deleteEducation")
	public ResponseEntity<String> deleteEducation(@RequestBody EducationDetailsDto dto){
		String employeeString = employeeService.deleteEmployeeEducation(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeString);
	}
	
//----------------------------[Employee Address]----------------------------------------------------------------------
	
	@PostMapping(path = "/adderssinfo")
	 public ResponseEntity<String> postAddressInfo(@RequestBody AddressDetailsListDto dto){
		String employeeId  = employeeService.saveAddressInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@GetMapping(path = "/getAddress")
	public ResponseEntity <List<AddressDetailsDto>> getAddress(@RequestBody AddressDetailsDto dto){
	 List<AddressDetailsDto> employeeId = employeeService.getAddressById(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	

	
	@PutMapping(path = "/updateAddress")
	public ResponseEntity<String> updateAddress(@RequestBody AddressDetailsDto dto){
		String employeeId = employeeService.updateEmployeeAddress(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@DeleteMapping(path = "/deleteAddress")
	public ResponseEntity<String> deleteAddress(@RequestBody AddressDetailsDto dto){
		String emplString = employeeService.deleteAddress(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(emplString);
	}
	
//------------------------------[Employee Experience]-----------------------------------------------------------------------

	
	@PostMapping(path = "/experienceinfo")
	 public ResponseEntity<String> postExperienceInfo(@RequestBody EmployeeExperienceListDto dto){
		String employeeId  = employeeService.saveExperienceInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	
	@GetMapping(path = "/getExperience")
	public ResponseEntity<List<EmployeeExperienceDto>> getEmployeeExperience(@RequestBody EmployeeExperienceListDto dto){
		List<EmployeeExperienceDto> employeeExperienceDtos = employeeService.getExperience(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeExperienceDtos);
	}
	
	@PutMapping(path = "/updateExperience")
	public ResponseEntity<String> updateExperience(@RequestBody EmployeeExperienceDto dto){
		String employeeString = employeeService.updateEmployeeExperience(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeString);
	}
	
	@DeleteMapping(path = "/deleteExperience")
	public ResponseEntity<String> deleteExperience(@RequestBody EmployeeExperienceDto dto){
		String employeeString = employeeService.deleteExperience(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeString);
		
		
	}
	
//----------------------------------[Employee Contact]-----------------------------------------------------------------
	
	
	
	@PostMapping(path = "/contactinfo")
	 public ResponseEntity<String> postContactInfo(@RequestBody EmployeeContactListDto dto){
		String employeeId  = employeeService.saveContactInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@PutMapping(path = "/updateContact")
	public ResponseEntity<String> updateContact(@RequestBody EmployeeContactDto dto){
	String employeeString	= employeeService.updateEmployeeContact(dto);
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeString);
	}
	
	@GetMapping(path = "/getContact")
	public ResponseEntity<List<EmployeeContactDto>> getAllContact(@RequestBody EmployeeContactListDto dto){
		List<EmployeeContactDto>contactDtos = employeeService.getAllContact(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(contactDtos);
	}
	
	@DeleteMapping(path = "/deleteContact")
	public ResponseEntity<String> deleteContact(@RequestBody EmployeeContactDto dto){
		String emploString = employeeService.deleteContact(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(emploString);
	}
	
//------------------------------[Employee TechnicalSkills]------------------------------------------------------------------
	
	@PostMapping(path = "/tinfo")
	public ResponseEntity<String> addSkill(@RequestBody TechnicalSkillsListDto dto)
	{
		String employeeId = employeeService.addSkills(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
				
	}
	
	@GetMapping(path = "/getSkill")
	public ResponseEntity<List<TechnicalSkillsDto>> getAllSkill(@RequestBody TechnicalSkillsListDto dto){
		List<TechnicalSkillsDto>skillsDtos = employeeService.getAllSkills(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(skillsDtos);
	}
	

}
