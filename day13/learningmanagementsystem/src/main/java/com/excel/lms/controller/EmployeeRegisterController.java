package com.excel.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.service.EmployeeServiceImpl;
import com.excel.lms.service.EmployeeServices;




@RequestMapping(path = "/api/v1/employee",method = { RequestMethod.POST,RequestMethod.PUT})
public class EmployeeRegisterController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping(path = "/get")
	private ResponseEntity<String> postEmployeeData(@RequestBody EmployeePrimaryInfoDto dto){
		String employee = employeeServices.savePrimary(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(employee);
	}

	
	
	
	

}
