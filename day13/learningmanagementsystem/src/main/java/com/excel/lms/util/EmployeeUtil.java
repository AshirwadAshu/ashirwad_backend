package com.excel.lms.util;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.enums.EmployeeStatus;

public class EmployeeUtil {

	private EmployeeUtil() {

	}

	public static EmployeePrimaryInfo dtoToEntity(EmployeePrimaryInfoDto employee) {
		return EmployeePrimaryInfo.builder().employeeId(employee.getEmployeeId())
				.employeeName(employee.getEmployeeName())
				.dateOfbirth(employee.getDateOfbirth())
				.dateOfJoing(employee.getDateOfJoing())
				.email(employee.getEmail())
				.bloodGroup(employee.getBloodGroup())
				.designation(employee.getDesignation())
				.gender(employee.getGender())
				.employeeStatus(employee.getEmployeeStatus())
				.build();
	}
	
	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto employee) {
		return EmployeeSecondaryInfo.builder()
				
				.panNo(employee.getPanNo())
				.aadharNo(employee.getAadharNo())
				.fatherName(employee.getFatherName())
				.motherName(employee.getMotherName())
				.spouseName(employee.getSpouseName())
				.pasportNo(employee.getPasportNo())
				
				.build();
	}
	
	
	public static BankDetails dtoToEntity(BankDetailsDto employee) {
		return BankDetails.builder()
		 .accountNo(employee.getAccountNo())
		.bankName(employee.getBankName())
		.accountType(employee.getAccountType())
		.IFSCcode(employee.getIFSCcode())
		.branch(employee.getBranch())
		.state(employee.getState())
		        
		.build();
	}

	
}
