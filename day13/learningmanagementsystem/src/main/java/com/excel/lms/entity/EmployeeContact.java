package com.excel.lms.entity;

import com.excel.lms.enums.ContactType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "employee_contact_info")
public class EmployeeContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId ;
	@Enumerated(EnumType.STRING)
	private ContactType contactType;
	private String contactNo;
	
	@ManyToOne
	private EmployeePrimaryInfo employeePrimaryInfo; 

}
