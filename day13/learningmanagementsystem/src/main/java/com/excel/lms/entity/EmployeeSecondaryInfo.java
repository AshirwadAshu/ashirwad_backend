package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.MaritalStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "employee_secondary_info")
public class EmployeeSecondaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer SecondaryId ;
	private String panNo;
	private String aadharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String pasportNo;
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;
	
	@JoinColumn(name = "employeeid")
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;

}
