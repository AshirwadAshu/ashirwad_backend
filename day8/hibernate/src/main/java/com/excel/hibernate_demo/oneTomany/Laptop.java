//package com.excel.hibernate_demo.oneTomany;
//
//import java.util.List;
//
//import com.excel.hibernate_demo.oneToone.Student;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name= "laptop")
//public class Laptop {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	
//	
//	@Column(name = "Laptop_brand")
//	private String brand;
//	
//	@Column(name = "Serial_no")
//	private String serialNo;
//	
//	
//	@ManyToOne(cascade = CascadeType.ALL,mappedBy = "laptop")
//	private Student student;
//
//
//	
//		
//	
//}
