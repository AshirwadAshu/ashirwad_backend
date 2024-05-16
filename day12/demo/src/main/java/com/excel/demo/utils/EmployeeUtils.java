package com.excel.demo.utils;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public class EmployeeUtils {
	
	private EmployeeUtils() {
	
	}

	public static  EmployeeDto entitytoDto(Employee employee) {
		
		return EmployeeDto.builder().id(employee.getId()).firstname(employee.getFirstname())
				.lastname(employee.getLastname()).aadhar(employee.getAadhar()).mobileNo(employee.getMobileNo())
				 .panNo(employee.getPanNo()).employee(employee.getEmployee()).build();
	}

}
