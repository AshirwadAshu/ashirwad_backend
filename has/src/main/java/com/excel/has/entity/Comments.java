package com.excel.has.entity;

import java.time.LocalDate;

import com.excel.has.enums.TechnicianStatus;

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

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentsId;
	
	private String comment;
	private LocalDate commentOn;
	private LocalDate updatedOn;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Customer customer;
	
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Technician technician;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private ServiceRequest  serviceRequest;
	
	
	
	
	

}
