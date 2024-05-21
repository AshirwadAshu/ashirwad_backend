package com.excel.has.dto;

import java.time.LocalDate;

import com.excel.has.entity.Customer;
import com.excel.has.entity.ServiceRequest;
import com.excel.has.entity.Technician;
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
public class CommentsDto {
private Integer commentsId;
	
	private String comment;
	private LocalDate commentOn;
	private LocalDate updatedOn;
}
