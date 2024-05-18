package com.excel.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.repository.BankDetailRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeSecondaryRepository employeeSecondaryRepository;
	@Autowired
	private BankDetailRepository bankDetailRepository;

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
						bankDetails.setIFSCcode(dto.getIFSCcode());
						bankDetails.setBranch(dto.getBranch());
						bankDetails.setState(dto.getState());


					}
					return employeeRepository.save(employee).getEmployeeId();
				}

		return null;
	}


}



















