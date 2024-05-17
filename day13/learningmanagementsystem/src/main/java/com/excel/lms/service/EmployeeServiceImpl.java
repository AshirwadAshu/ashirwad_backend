package com.excel.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepository;






	public String savePrimary(EmployeePrimaryInfoDto dto) {

		if(!employeeRepository.findByEmployeeid(dto.getEmployeeid()).isPresent()){

			EmployeePrimaryInfo emp= EmployeeUtil.dtotoentity(dto);
			EmployeePrimaryInfo emp1=employeeRepository.savePrimary(dto);
			return emp1.getEmployeeid();
		}
		return null;
	}





}
