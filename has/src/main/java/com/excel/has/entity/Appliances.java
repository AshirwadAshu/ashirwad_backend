package com.excel.has.entity;

import java.time.LocalDate;

import com.excel.has.enums.Brands;
import com.excel.has.enums.ProductType;
import com.excel.has.enums.WarrantyStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Appliances {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer applianceId;

	private Brands brands;
	private LocalDate yearOfManufacturing;
	private ProductType product;
	private String serialNo;
	private WarrantyStatus warrantyStatus;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ServiceRequest serviceRequest;

}
