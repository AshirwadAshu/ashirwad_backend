package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.utils.EmployeeUtils;

public interface EmployeeService {
	
	public EmployeeDto addEmployee(EmployeeDto dto);
	
	
	public void deleteEmployee(EmployeeDto dto);
	
	
	public EmployeeDto getByEmployeeId( Integer id );
	
	public EmployeeDto updateEmployee(EmployeeDto dto,Integer id);
	
	public List<EmployeeDto> getAllEmployee();
	

}
