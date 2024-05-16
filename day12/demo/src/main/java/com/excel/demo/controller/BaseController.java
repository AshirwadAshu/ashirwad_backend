package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.excel.demo.commonresponse.CommonResponse;
import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.repository.EmployeeRepository;
import com.excel.demo.service.EmployeeService;

@RestController
public class BaseController {
	@Autowired
	private EmployeeService employeeService;


	@GetMapping ("/home")
	public ResponseEntity<String> homeGetReq() {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("hello");

	}
	@PostMapping("/add")
	public ResponseEntity<CommonResponse <EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto = employeeService.addEmployee(employee);

		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message(EmployeeConstant.EMPLOYEE_ADDED_MESSAGE).build());
	}	

	
	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeDto> getByEmployeeId(@PathVariable Integer id){
		EmployeeDto employeeDto = employeeService.getByEmployeeId(id)
				;
		return ResponseEntity.status(HttpStatus.OK).body(employeeDto);
	}


	@DeleteMapping("/delete")
	public void deleteEmployee(@RequestBody EmployeeDto dto){
		employeeService.deleteEmployee(dto);
		ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_MESSEGE);
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto ,@PathVariable Integer id) {
		EmployeeDto dto	=employeeService.updateEmployee(employeeDto, id);
		return ResponseEntity.status(HttpStatus.OK).body(dto);

	}




	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees(){
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}



	@PutMapping("/home/{str}")
	public ResponseEntity<String> homePutReq(@PathVariable String str ) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str);
	}

	@DeleteMapping("/home/{str}")
	public ResponseEntity<String> homeDeleteReq(@PathVariable String str ) {

		return ResponseEntity.ok(str);
	}
}
