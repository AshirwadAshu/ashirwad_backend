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

@Service

public class EmployeeServiceImplement implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee = Employee.builder().firstname(dto.getFirstname()).lastname(dto.getLastname())
				.aadhar(dto.getAadhar()).mobileNo(dto.getMobileNo())
				.panNo(dto.getPanNo()).employee(dto.getEmployee()).build();

//		employee.setId((int) (Math.random() * 10));
//		employees.add(employee);
		
		Employee save = employeeRepository.save(employee);

		return EmployeeDto.builder().id(save.getId()).firstname(save.getFirstname())
				.lastname(save.getLastname()).aadhar(save.getAadhar()).mobileNo(save.getMobileNo())
				.panNo(save.getPanNo()).employee(save.getEmployee()).build();

	}
//	@Override
//	public void deleEmployee(EmployeeDto dto) {
//		Optional<Employee> optional = employeeRepository.findById(dto.getId());
//		if(optional.isPresent())
//			employeeRepository.delete(optional.get());
//		else
//			throw new EmployeeNotFoundException(EmployeeConstant.EMPLOYEE_DELETED_SUCCESS)
//	}

	@Override
	public EmployeeDto deleteEmployee(EmployeeDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(e -> EmployeeDto.builder().id(e.getId()).aadhar(e.getAadhar()).firstname(e.getFirstname())
			   .lastname(e.getLastname()).mobileNo(e.getMobileNo()).panNo(e.getPanNo()).build()
			   ).toList();
	}

	

}
