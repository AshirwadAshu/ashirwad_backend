package com.excel.has.dto;

import java.time.LocalDate;
import java.util.List;

import com.excel.has.entity.Comments;
import com.excel.has.entity.ServiceRequest;
import com.excel.has.enums.Brands;
import com.excel.has.enums.ProductType;
import com.excel.has.enums.TechnicianStatus;
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
public class TechnicianDto {
private Integer technicianId;
	
	private String technicianFirstName;
	private String technicianLastName;

    private Long  technicianMobileNo;
    private String technicianEmail;
    private String address;
    
    private TechnicianStatus technicianStatus;
}
