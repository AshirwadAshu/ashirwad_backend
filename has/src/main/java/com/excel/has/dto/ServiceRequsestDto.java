package com.excel.has.dto;

import java.time.LocalDate;
import java.util.List;

import com.excel.has.entity.Appliances;
import com.excel.has.entity.Comments;
import com.excel.has.entity.Customer;
import com.excel.has.entity.Technician;
import com.excel.has.enums.Brands;
import com.excel.has.enums.ProductType;
import com.excel.has.enums.ServiceStatus;
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
public class ServiceRequsestDto {
private Integer serviceId;
	
	private LocalDate createdOn;
	private LocalDate updatedOn;
	private LocalDate appointmentDate;
	private ServiceStatus serviceStatus;

}
