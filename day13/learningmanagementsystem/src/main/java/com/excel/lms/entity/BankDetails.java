package com.excel.lms.entity;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import com.excel.lms.enums.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	
	@Enumerated(EnumType.STRING)
	private AccountType accountNo;
	
	private String bankName;
	private String accountType;
	private String IFSCcode;
	private String branch;
	private String state;
	
	@OneToOne
	private EmployeePrimaryInfo employeePrimaryInfo; 

}
