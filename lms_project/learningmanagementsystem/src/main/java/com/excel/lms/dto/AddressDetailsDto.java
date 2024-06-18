package com.excel.lms.dto;

import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;

import jakarta.persistence.Entity;
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
public class AddressDetailsDto {
	
	private Integer  addressDetailsId ;
	
	private String employeeId;
	private String addressType;
	private String doorNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String pincode;
	private String landmark;
	
}
