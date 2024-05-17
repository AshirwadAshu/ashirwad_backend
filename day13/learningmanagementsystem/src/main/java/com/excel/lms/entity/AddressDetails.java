package com.excel.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee_address_info")
public class AddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  AddressDetailsId ;
	
	private String addressType;
	private String doorNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String pincode;
	private String landmark;
	
	@ManyToOne
	private EmployeePrimaryInfo employeePrimaryInfo;
}
