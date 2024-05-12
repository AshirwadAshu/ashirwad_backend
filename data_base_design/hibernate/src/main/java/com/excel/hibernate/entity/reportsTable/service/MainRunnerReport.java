package com.excel.hibernate.entity.reportsTable.service;



import com.excel.hibernate.entity.reportsTable.Report;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerReport {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("reports");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
	  Report rp = new Report();
		
		
		
		et.begin();
		em.persist(rp);
		et.commit();
		
		em.close();
	}

}
