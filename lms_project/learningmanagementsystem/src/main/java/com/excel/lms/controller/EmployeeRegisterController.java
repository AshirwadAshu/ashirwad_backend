package com.excel.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.dto.EmployeeContactListDto;
import com.excel.lms.dto.EmployeeExperienceDto;
import com.excel.lms.dto.EmployeeExperienceListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.BankDetails;
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
	
	@PostMapping(path="/sinfo")
	public ResponseEntity<String> postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto){
		
		String employeeId = employeeService.saveSecondary(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
		
	}
	
	
	
	@PostMapping(path="/binfo")
	public ResponseEntity<String> postBankInfo(@RequestBody BankDetailsDto dto){
		String employeeId = employeeService.saveBankInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);	
	}
	
	@PostMapping(path = "/eduinfo")
	
	public ResponseEntity<String> postEducationInfo(@RequestBody EducationDetailsListDto dto){
		String employeeId	 = employeeService.saveEducationInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@PostMapping(path = "/adderssinfo")
	 public ResponseEntity<String> postAddressInfo(@RequestBody AddressDetailsListDto dto){
		String employeeId  = employeeService.saveAddressInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	
	@PostMapping(path = "/experienceinfo")
	 public ResponseEntity<String> postExperienceInfo(@RequestBody EmployeeExperienceListDto dto){
		String employeeId  = employeeService.saveExperienceInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	
	@PostMapping(path = "/contactinfo")
	 public ResponseEntity<String> postContactInfo(@RequestBody EmployeeContactListDto dto){
		String employeeId  = employeeService.saveContactInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
	}
	
	@PostMapping(path = "/tinfo")
	public ResponseEntity<String> addSkill(@RequestBody TechnicalSkillsListDto dto)
	{
		String employeeId = employeeService.addSkills(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employeeId);
				
	}
	

}
