package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer primaryId;

	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoing;
	private LocalDate dateOfbirth;

	private String email;
	private String bloodGroup;
	@Enumerated(EnumType.STRING)
	private Designation designation;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String nationality;
	private String employeeStatus;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private EmployeeSecondaryInfo employeeSecondaryInfo;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE.PERSIST.DETACH.REFRESH, mappedBy = "employeePrimaryInfo")
	private List<AddressDetails> addressDetails;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private BankDetails bankDetails;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE.PERSIST.DETACH.REFRESH, mappedBy = "employeePrimaryInfo")
	private List<EducationDetails> educationDetails;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE.PERSIST.DETACH.REFRESH, mappedBy = "employeePrimaryInfo")
	private List<EmployeeContact> employeeContacts;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE.PERSIST.DETACH.REFRESH, mappedBy = "employeePrimaryInfo")
	private List<EmployeeExperience> employeeExperience;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfos")
	private List<TechnicalSkills> technicalSkills;
}
