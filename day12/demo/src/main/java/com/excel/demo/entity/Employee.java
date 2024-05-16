package com.excel.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy =   GenerationType.IDENTITY)
	private Integer id ;
	private String firstname;
	private String lastname;
	private String mobileNo;
	private String aadhar;
	private String panNo;
	private String employee;
	

}
