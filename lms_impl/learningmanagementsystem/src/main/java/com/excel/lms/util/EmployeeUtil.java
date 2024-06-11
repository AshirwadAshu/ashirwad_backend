package com.excel.lms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EducationDetailsDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.dto.EmployeeExperienceDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeExperience;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.enums.EmployeeStatus;

public class EmployeeUtil {

	private EmployeeUtil() {

	}

	public static EmployeePrimaryInfo dtoToEntity(EmployeePrimaryInfoDto employee) {
		return EmployeePrimaryInfo.builder().employeeId(employee.getEmployeeId())
				.employeeName(employee.getEmployeeName())
				.dateOfbirth(employee.getDateOfbirth())
				.dateOfJoing(employee.getDateOfJoing())
				.email(employee.getEmail())
				.bloodGroup(employee.getBloodGroup())
				.designation(employee.getDesignation())
				.gender(employee.getGender())
				.employeeStatus(employee.getEmployeeStatus())
				.build();
	}
	
	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto employee) {
		return EmployeeSecondaryInfo.builder()
				
				.panNo(employee.getPanNo())
				.aadharNo(employee.getAadharNo())
				.fatherName(employee.getFatherName())
				.motherName(employee.getMotherName())
				.spouseName(employee.getSpouseName())
				.pasportNo(employee.getPasportNo())
				
				.build();
	}
	
	
	public static BankDetails dtoToEntity(BankDetailsDto employee) {
		return BankDetails.builder()
		 .accountNo(employee.getAccountNo())
		.bankName(employee.getBankName())
		.accountType(employee.getAccountType())
		.ifscCode(employee.getIFSCcode())
		.branch(employee.getBranch())
		.state(employee.getState())
		        
		.build();
	}
    
	public static List<EducationDetails> educationToEntity(List<EducationDetailsDto> education) 
	{   
		return education.stream()
	    		.map(x -> EducationDetails.builder()
	            .educationType(x.getEducationType())
	            .yearOfpassing(x.getYearOfpassing())
	            .percentage(x.getPercentage())
	            .universityName(x.getUniversityName())
	            .instuteName(x.getInstuteName())
	            .specialization(x.getSpecialization())
	            .state(x.getState())
	            .build())
	            .collect(Collectors.toList());
	}
	
	
//	public static List<AddressDetails> addressToEntity(List<AddressDetailsDto> address)
//	{
//		return address.stream()
//	    		.map(x -> AddressDetails.builder()
//	    		.addressType(x.getAddressType())
//	    		.doorNo(x.getDoorNo())
//	    		.street(x.getStreet())
//	    		.locality(x.getLocality())
//	    		.city(x.getCity())
//	    		.state(x.getState())
//	    		.pincode(x.getPincode())
//	    		.landmark(x.getLandmark())	
//	            .build())
//	            .collect(Collectors.toList());
//	}
	
	public static List<EmployeeExperience> experienceToEntity(List<EmployeeExperienceDto> experience)
	{
		return experience.stream().map(x -> EmployeeExperience.builder()
				.companyName(x.getCompanyName())
				.dateOfJoing(x.getDateOfJoing())
				.dateOfReliving(x.getDateOfReliving())
				.desgnation(x.getDesgnation())
				.location(x.getLocation())
				.yearOfexperience(x.getYearOfexperience())
				.build())
				.collect(Collectors.toList());
	    		
	           
	}
	
	
	public static List<EmployeeContact> contactToEntity(List<EmployeeContactDto> contact)
	{
		return contact.stream().map(x -> EmployeeContact.builder()
				.contactId(x.getContactId())
				.contactType(x.getContactType())
				.contactNo(x.getContactNo())
				
				.build()).collect(Collectors.toList());
	
	}
	
	public static TechnicalSkills dtoToEntity(TechnicalSkillsDto dto) {
		return TechnicalSkills.builder()
				.skillType(dto.getSkillType())
				.skillRating(dto.getSkillRating())
				.yearOfExperience(dto.getYearOfexperience()).employeePrimaryInfos(new ArrayList<>())
				.build();
		
	}

//	public static List<AddressDetailsDto> entityToAddressDto(List<AddressDetails> adressDetails) {
//		
//		return adressDetails.stream()
//	    		.map(x -> AddressDetailsDto.builder()
//	    				.employeeId(x.getEmployeePrimaryInfo().getEmployeeId())	
//	    		.addressType(x.getAddressType())
//	    		.doorNo(x.getDoorNo())
//	    		.street(x.getStreet())
//	    		.locality(x.getLocality())
//	    		.city(x.getCity())
//	    		.state(x.getState())
//	    		.pincode(x.getPincode())
//	    		.landmark(x.getLandmark())	
//	            .build())
//	            .collect(Collectors.toList());
//	}
	
	
	
}
