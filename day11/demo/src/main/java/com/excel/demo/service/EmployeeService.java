package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto dto);
	public EmployeeDto deleteEmployee(EmployeeDto dto);
	public List<EmployeeDto> getAllEmployee();

}
