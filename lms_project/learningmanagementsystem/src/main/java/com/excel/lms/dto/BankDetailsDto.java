package com.excel.lms.dto;

import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.enums.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDetailsDto {

	private Integer bankDetailsId ;
	private String employeeId;
  
	private String accountNo;
	
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
	
	
	private EmployeePrimaryInfo employeePrimaryInfo; 
}
