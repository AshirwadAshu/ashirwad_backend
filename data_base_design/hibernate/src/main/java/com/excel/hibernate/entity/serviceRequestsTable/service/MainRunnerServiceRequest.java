package com.excel.hibernate.entity.serviceRequestsTable.service;


import com.excel.hibernate.entity.serviceRequestsTable.ServiceRequest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerServiceRequest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("service_requests");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		ServiceRequest sr = new ServiceRequest();
	
		
		
		
		et.begin();
		em.persist(sr);
		et.commit();
		
		em.close();
	}
}