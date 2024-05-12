package com.excel.hibernate.entity.communicationsTable.service;

import com.excel.hibernate.entity.communicationsTable.Communication;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerCommunications {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("communications");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
   Communication cm = new Communication();
	
	
	
	et.begin();
	em.persist(cm);
	et.commit();
	
	em.close();
}

}
