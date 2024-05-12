package com.excel.hibernate.entity.sparePartsTable.service;

import com.excel.hibernate.entity.serviceRequestsTable.ServiceRequest;
import com.excel.hibernate.entity.sparePartsTable.SparePart;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerSpareParts {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("spare_parts");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		SparePart sp = new SparePart();
	
		
		
		
		et.begin();
		em.persist(sp);
		et.commit();
		
		em.close();
	}

}
