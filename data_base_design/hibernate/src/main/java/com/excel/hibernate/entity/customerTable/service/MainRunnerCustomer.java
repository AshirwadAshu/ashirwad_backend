package com.excel.hibernate.entity.customerTable.service;

import com.excel.hibernate.entity.customerTable.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerCustomer {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Customer cst = new Customer();
		cst.setUsername("nithin");
		cst.setPhoneNumber("978765655");
		cst.setEmail("nithi@gmail");
		cst.setAddress("tipptur");
		cst.setPasswordHash("75HJH");
	
		
		
		
		et.begin();
		em.persist(cst);
		et.commit();
		
		em.close();
	}
}