package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeStatus {
	
 	TERMINATED("TERMINATED"),ACTIVE("ACTIVE");

	
	private final String employeeStatusType;

}
