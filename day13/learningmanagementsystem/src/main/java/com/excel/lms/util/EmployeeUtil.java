package com.excel.lms.util;

import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;

public class EmployeeUtil {

	private EmployeeUtil() {
		
	}
	
	public static  EmployeePrimaryInfo dtotoentity(EmployeePrimaryInfoDto employee) {
		return EmployeePrimaryInfo.builder().employeeid(employee.getEmployeeid()).employeeName(employee.getEmployeeName())
				.dateOfJoing(employee.getDateOfJoing()).dateOfbirth(employee.getDateOfbirth()).email(employee.getEmail())
				.bloodGroup(employee.getBloodGroup()).designation(employee.getDesignation()).gender(employee.getGender())
				.nationality(employee.getNationality()).employeeStatus(employee.getEmployeeStatus()).build();
	}
}
