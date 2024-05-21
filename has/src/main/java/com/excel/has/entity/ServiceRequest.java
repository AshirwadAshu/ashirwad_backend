package com.excel.has.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.has.enums.ServiceStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceId;
	
	private LocalDate createdOn;
	private LocalDate updatedOn;
	private LocalDate appointmentDate;
	private ServiceStatus serviceStatus;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private Customer customer;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "serviceRequest")
	private Technician technician;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "serviceRequest")
	private List<Comments> comments;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "serviceRequest")
	private List<Appliances> appliances;

}
