package com.excel.has.dto;

import java.time.LocalDate;
import java.util.List;

import com.excel.has.entity.Appliances;
import com.excel.has.entity.Comments;
import com.excel.has.enums.Brands;
import com.excel.has.enums.ProductType;
import com.excel.has.enums.WarrantyStatus;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomersDto {
	private Integer customerId;
	private String customerFirstName;
	private String customerLastName;
	private String email;
	private String password;
	private Long phoneNo;
	private String address;
	

}
