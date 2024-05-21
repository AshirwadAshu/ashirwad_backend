package com.excel.has.entity;

import java.util.List;

import com.excel.has.enums.TechnicianStatus;

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

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Technician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer technicianId;
	
	private String technicianFirstName;
	private String technicianLastName;

    private Long  technicianMobileNo;
    private String technicianEmail;
    private String address;
    
    private TechnicianStatus technicianStatus;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "technician")
    private List<Comments>comments;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private ServiceRequest serviceRequest;
    
    
	

}
