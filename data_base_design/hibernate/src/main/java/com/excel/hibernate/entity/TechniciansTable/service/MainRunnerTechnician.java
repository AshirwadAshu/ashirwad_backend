package com.excel.hibernate.entity.TechniciansTable.service;

import com.excel.hibernate.entity.TechniciansTable.Technicians;
import com.excel.hibernate.entity.customerTable.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerTechnician {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Technicians");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	

	Technicians tech = new Technicians();
	
	
	et.begin();
	em.persist(tech);
	et.commit();
	
	em.close();
}
}