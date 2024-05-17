package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.demo.entity.Employee;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.entity.EmployeePrimaryInfo;

public interface EmployeeRepository extends JpaRepository<EmployeePrimaryInfo, Integer>{
  Optional<EmployeePrimaryInfoDto>findByEmployeeid(String employeeid);

EmployeePrimaryInfo savePrimary(EmployeePrimaryInfoDto dto);
  

}
