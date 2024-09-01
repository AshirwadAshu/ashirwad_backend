package com.excel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.excel.model.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> list = new ArrayList<>();
	
	public EmployeeService() {
		list.add(new Employee(UUID.randomUUID().toString(),"bob","bob@gamil.com"));
		list.add(new Employee(UUID.randomUUID().toString(),"Rishab","rishab@gamil.com"));
		
	}
	public List<Employee>getEmployees(){
		return list;
	}

}
