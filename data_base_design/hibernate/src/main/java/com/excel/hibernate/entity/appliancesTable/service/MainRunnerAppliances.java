package com.excel.hibernate.entity.appliancesTable.service;

import com.excel.hibernate.entity.appliancesTable.Appliances;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerAppliances {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("appliances");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Appliances app = new Appliances();
		
		
		et.begin();
		em.persist(app);
		em.close();
		
	}

}
