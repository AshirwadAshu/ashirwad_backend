package com.excel.lms.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EducationDetailsDto;
import com.excel.lms.dto.EducationDetailsListDto;
import com.excel.lms.dto.EmployeeContactDto;
import com.excel.lms.dto.EmployeeContactListDto;
import com.excel.lms.dto.EmployeeExperienceDto;
import com.excel.lms.dto.EmployeeExperienceListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.dto.TechnicalSkillsListDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeExperience;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.repository.AddressDetailRepository;
import com.excel.lms.repository.BankDetailRepository;
import com.excel.lms.repository.EducationDetailRepository;
import com.excel.lms.repository.EmployeeContactRepository;
import com.excel.lms.repository.EmployeeExperienceRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.repository.TechnicalSkillsRepository;
import com.excel.lms.util.EmployeeUtil;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeSecondaryRepository employeeSecondaryRepository;
	@Autowired
	private BankDetailRepository bankDetailRepository;
	@Autowired
	private EducationDetailRepository educationDetailRepository;
	
	@Autowired
	private AddressDetailRepository addressDetailRepository;
	@Autowired
	private EmployeeContactRepository contactRepository;
	
	@Autowired
	private EmployeeExperienceRepository employeeExperienceRepository;
	
	@Autowired
	private TechnicalSkillsRepository technicalSkillsRepository;

	public String savePrimary(EmployeePrimaryInfoDto dto) {

		if (!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {

			EmployeePrimaryInfo emp = EmployeeUtil.dtoToEntity(dto);
			EmployeePrimaryInfo emp1 = employeeRepository.save(emp);
			return emp1.getEmployeeId();
		}
		return null;
	}

	@Override
	public String saveSecondary(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {

			EmployeePrimaryInfo employee = optional.get();
			if (employee.getEmployeeSecondaryInfo() == null) {
				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeUtil.dtoToEntity(dto);

				employee.setEmployeeSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setEmployeePrimaryInfo(employee);

				return employeeRepository.save(employee).getEmployeeId();
				//				employeeSecRepository.save(employeeSecondaryInfo).getEmployee().getEmployeeId();

			} else {
				EmployeeSecondaryInfo employeeSecondaryInfo = employee.getEmployeeSecondaryInfo();

				employeeSecondaryInfo.setPanNo(dto.getPanNo());
				employeeSecondaryInfo.setAadharNo(dto.getAadharNo());
				employeeSecondaryInfo.setFatherName(dto.getFatherName());
				employeeSecondaryInfo.setMotherName(dto.getMotherName());
				employeeSecondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				employeeSecondaryInfo.setPasportNo(dto.getPasportNo());
				employeeSecondaryInfo.setSpouseName(dto.getSpouseName());

			}
			return employeeRepository.save(employee).getEmployeeId();

		}
		return null;

	}

	@Override
	public String saveBankInfo(BankDetailsDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
				if (optional.isPresent()) {
					EmployeePrimaryInfo employee = optional.get();
					if (employee.getBankDetails() == null) {
						BankDetails employeeBankDetails = EmployeeUtil.dtoToEntity(dto);

						employee.setBankDetails(employeeBankDetails);
						employeeBankDetails.setEmployeePrimaryInfo(employee);

						return employeeRepository.save(employee).getEmployeeId();
					} else {
						BankDetails bankDetails = employee.getBankDetails();
						bankDetails.setAccountNo(dto.getAccountNo());
						bankDetails.setBankName(dto.getBankName());
						bankDetails.setAccountType(dto.getAccountType());
						bankDetails.setIfscCode(dto.getIFSCcode());
						bankDetails.setBranch(dto.getBranch());
						bankDetails.setState(dto.getState());


					}
					return employeeRepository.save(employee).getEmployeeId();
				}

		return null;
	}

	@Override
	public String saveEducationInfo(EducationDetailsListDto dto) {

		Optional<EmployeePrimaryInfo> optionalEducation = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalEducation.isPresent())
		{
			EmployeePrimaryInfo employee = optionalEducation.get();
			List<EducationDetails> education = EmployeeUtil.educationToEntity(dto.getEducations());
			if(employee.getEducationDetails() != null)
			{
				employee.getEducationDetails().stream().forEach(edu -> educationDetailRepository.delete(edu));
			}
			
			education.stream().forEach(x -> x.setEmployeePrimaryInfo(employee));
			employee.setEducationDetails(education);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
	
		return null ;
	}

	@Override
	public String saveAddressInfo(AddressDetailsListDto dto) {
		Optional<EmployeePrimaryInfo> optionalAddress = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalAddress.isPresent()) {
			
			EmployeePrimaryInfo employee = optionalAddress.get();
			List<AddressDetails> address = dto.getAddress()
					.stream().map(e -> AddressDetails.builder()
							.addressType(e.getAddressType())
							.doorNo(e.getDoorNo())
							.street(e.getStreet())
							.locality(e.getLocality()).city(e.getCity()).state(e.getState()).pincode(e.getPincode()).landmark(e.getLandmark())
							.build()).collect(Collectors.toList());
			
			employee.setAddressDetails(address);
			address.stream().forEach(e -> e .setEmployeePrimaryInfo(employee));
			return employeeRepository.save(employee).getEmployeeId();

		}
		
		
		return null;
	}
	
	@Override
	public List<AddressDetailsDto> getAddressById(AddressDetailsDto dto) {
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		if(employeeOptional.isPresent()) {
			EmployeePrimaryInfo emp = employeeOptional.get();
			
			List<AddressDetails> adressDetails = emp.getAddressDetails();
			return adressDetails.stream()
		    		.map(x -> AddressDetailsDto.builder()
		    		.employeeId(x.getEmployeePrimaryInfo().getEmployeeId())	
		    		.addressType(x.getAddressType())
		    		.doorNo(x.getDoorNo())
		    		.street(x.getStreet())
		    		.locality(x.getLocality())
		    		.city(x.getCity())
		    		.state(x.getState())
		    		.pincode(x.getPincode())
		    		.landmark(x.getLandmark())	
		            .build())
		            .collect(Collectors.toList());
		}
		
		return null;
	}

	@Override
	public String saveExperienceInfo(EmployeeExperienceListDto dto) {
		Optional<EmployeePrimaryInfo> optionalExperience = employeeRepository.findByEmployeeId(dto.getEmployeeId());
           if(optionalExperience.isPresent()) {
			
			EmployeePrimaryInfo employee = optionalExperience.get();
			List<EmployeeExperience> experience = EmployeeUtil.experienceToEntity(dto.getExperience());
			if(employee.getEmployeeExperience()!= null)
			{
				employee.getEmployeeExperience().stream().forEach(expe -> employeeExperienceRepository.delete(expe));
			}
		    experience.stream().forEach(x -> x.setEmployeePrimaryInfo(employee));
		    employee.setEmployeeExperience(experience);
		    employeeRepository.save(employee);
			
			return employee.getEmployeeId();
		
	
           }
           return null;

	}

	@Override
	public String saveContactInfo(EmployeeContactListDto dto) {
		
		Optional<EmployeePrimaryInfo> optionalContact = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		  if(optionalContact.isPresent()) {
				
				EmployeePrimaryInfo employee = optionalContact.get();
				List<EmployeeContact> Contact = EmployeeUtil.contactToEntity(dto.getContact());
				if(employee.getEmployeeContacts()!= null)
				{
					employee.getEmployeeContacts().stream().forEach(cont -> contactRepository.delete(cont));
				}
				
				Contact.stream().forEach(x -> x.setEmployeePrimaryInfo(employee));
				employee.setEmployeeContacts(Contact);
			     employeeRepository.save(employee);
				return employee.getEmployeeId();
				
				
		  }		
				
		return null;
	}

	@Override
	public String addSkills(TechnicalSkillsListDto dto) {
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			List<TechnicalSkills> skills = dto.getSkills().stream().map(skill ->
			{
			Optional<TechnicalSkills> optional = technicalSkillsRepository
						.findBySkillTypeAndSkillRatingAndYearOfExperience(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfexperience());
				
			return optional.isPresent() ? optional.get() : EmployeeUtil.dtoToEntity(skill);				
			}).collect(Collectors.toList());
			
			if(employee.getTechnicalSkills() != null)
				{
					employee.getTechnicalSkills().clear();
				}
			
			skills.stream().forEach(x -> {
				if(!x.getEmployeePrimaryInfos().contains(employee))
					x.getEmployeePrimaryInfos().add(employee);
			});
			
			employee.setTechnicalSkills(skills);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
			
		}
		return null;
	}

	@Override
	public List<EducationDetailsDto> saveEducation(EducationDetailsListDto dto) {
		Optional<EmployeePrimaryInfo>optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			
			List<EducationDetails> educationDetail = employeePrimaryInfo.getEducationDetails();
			return educationDetail.stream().map(e -> EducationDetailsDto.builder()
					.employeeId(e.getEmployeePrimaryInfo().getEmployeeId())
					.educationType(e.getEducationType())
					.yearOfpassing(e.getYearOfpassing())
					.percentage(e.getPercentage())
					.universityName(e.getUniversityName())
					.instuteName(e.getInstuteName())
					.specialization(e.getSpecialization())
					.state(e.getState())
					.build()).collect(Collectors.toList());
				
		}
		return null;
	}

	@Override
	public List<EmployeeExperienceDto> getExperience(EmployeeExperienceListDto dto) {
		Optional<EmployeePrimaryInfo>optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			
			List<EmployeeExperience> employeeExperiences = employeePrimaryInfo.getEmployeeExperience();
			return employeeExperiences.stream().map(e -> EmployeeExperienceDto.builder()
					.EmployeeExperienceId(e.getEmployeeExperienceId())
					.employeeId(e.getEmployeePrimaryInfo().getEmployeeId())
					.companyName(e.getCompanyName())
					.yearOfexperience(e.getYearOfexperience())
					.dateOfJoing(e.getDateOfJoing())
					.dateOfReliving(e.getDateOfReliving())
					.desgnation(e.getDesgnation())
					.location(e.getLocation())
					.build()).collect(Collectors.toList());
		
		}
		return null;
	}

	@Override
	public List<EmployeeContactDto> getAllContact(EmployeeContactListDto dto) {
		Optional<EmployeePrimaryInfo>optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInf = optional.get();
			List<EmployeeContact> contacts = employeePrimaryInf.getEmployeeContacts();
			
			return contacts.stream().map(e -> EmployeeContactDto.builder()
					.contactId(e.getContactId())
					.contactType(e.getContactType())
					.contactNo(e.getContactNo())
					
					.build()).collect(Collectors.toList());
			
			}
		return null;
	}

	@Override
	public List<TechnicalSkillsDto> getAllSkills(TechnicalSkillsListDto dto) {
	Optional<EmployeePrimaryInfo>optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
	
	if(optional.isPresent()) {
		EmployeePrimaryInfo employeePrimaryInfo = optional.get();
		 List<TechnicalSkills>technicalSkills = employeePrimaryInfo.getTechnicalSkills();
		 
		 return technicalSkills.stream().map(e -> TechnicalSkillsDto.builder()
				 .TechnicalSkillsId(e.getTechnicalSkillsId())
				 .skillType(e.getSkillType())
				 .skillRating(e.getSkillRating())
				 .yearOfexperience(e.getYearOfExperience())
				 .build()).collect(Collectors.toList());
		
	}
		return null;
	}

	@Override
	public String updateAddress(AddressDetailsListDto dto) {
		
		Optional<EmployeePrimaryInfo>optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			
			List<AddressDetails>addressDetails = dto.getAddress()
					.stream().map(e ->AddressDetails.builder()
							.addressType(e.getAddressType())
							.doorNo(e.getDoorNo())
							.street(e.getStreet())
							.locality(e.getLocality())
							.city(e.getCity())
							.state(e.getState())
							.pincode(e.getPincode())
							.landmark(e.getLandmark())
					
							.build() ).collect(Collectors.toList());
					
			employeePrimaryInfo.setAddressDetails(addressDetails);
			employeeRepository.save(employeePrimaryInfo);
			return employeePrimaryInfo.getEmployeeId();
		
		}
		
		return null;
	}




}














