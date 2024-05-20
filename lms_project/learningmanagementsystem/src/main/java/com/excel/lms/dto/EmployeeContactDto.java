package com.excel.lms.dto;

import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.enums.ContactType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class EmployeeContactDto {
	
	private Integer contactId ;
	

	private ContactType contactType;
	
	private String contactNo;
	

	private EmployeePrimaryInfo employeePrimaryInfo; 
}
