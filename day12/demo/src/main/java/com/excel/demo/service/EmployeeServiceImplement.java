package com.excel.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.exception.EmployeeNotFoundException;
import com.excel.demo.repository.EmployeeRepository;
import com.excel.demo.utils.EmployeeUtils;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service

public class EmployeeServiceImplement implements EmployeeService {
 
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee = Employee.builder().firstname(dto.getFirstname()).lastname(dto.getLastname())
				.aadhar(dto.getAadhar()).mobileNo(dto.getMobileNo())
				.panNo(dto.getPanNo()).employee(dto.getEmployee()).build();


		Employee save = employeeRepository.save(employee);

		return EmployeeUtils.entitytoDto(save);

	}
	@Override
	public void deleteEmployee(EmployeeDto dto) {
		
		Optional<Employee> optional = employeeRepository.findById(dto.getId());
	
		if(optional.isPresent()) {
			employeeRepository.delete(optional.get());
		}
	
	}

	


	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(e -> EmployeeDto.builder().id(e.getId()).aadhar(e.getAadhar()).firstname(e.getFirstname())
						.lastname(e.getLastname()).mobileNo(e.getMobileNo()).panNo(e.getPanNo()).build()
						).toList();
	}

	@Override
	public EmployeeDto getByEmployeeId(Integer id) {
		
		Optional<Employee> optional = employeeRepository.findById(id)
;
		
		if(optional.isPresent()) {
			Employee employee = optional.get();
			
			return EmployeeUtils.entitytoDto(employee);
		}
		
		return null;
	}
	
	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto, Integer id) {
		Optional<Employee> optional = employeeRepository.findById(id)
;
		if(optional.isPresent()) {
			Employee em	=optional.get();
			log.info(dto.getFirstname());
			em.setFirstname(dto.getFirstname());
			em.setLastname(dto.getLastname());
			Employee update = employeeRepository.save(em);
			return EmployeeUtils.entitytoDto( update);
		}
		else 
			 throw new  EmployeeNotFoundException ("not null");
				}



		
			
	}




