package com.excel.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "employee_bank_details")
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer BankDetailsId ;
	
	private String accountNo;
	private String bankName;
	private String accountType;
	private String IFSCcode;
	private String branch;
	private String state;

}
