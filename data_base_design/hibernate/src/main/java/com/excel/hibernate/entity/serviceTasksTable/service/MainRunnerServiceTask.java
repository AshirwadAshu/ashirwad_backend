package com.excel.hibernate.entity.serviceTasksTable.service;

import com.excel.hibernate.entity.serviceRequestsTable.ServiceRequest;
import com.excel.hibernate.entity.serviceTasksTable.ServiceTask;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerServiceTask {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("service_tasks");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
   ServiceTask sts =new ServiceTask();
	
	
	
	et.begin();
	em.persist(sts);
	et.commit();
	
	em.close();
}
}
