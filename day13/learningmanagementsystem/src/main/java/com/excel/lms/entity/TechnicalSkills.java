package com.excel.lms.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Table(name = "employee_technicalskills_info")
public class TechnicalSkills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer TechnicalSkillsId ;
	
	private String skillType;
	private String skillRating;
	private Integer yearOfexperience;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo>employeePrimaryInfos;
	
}
