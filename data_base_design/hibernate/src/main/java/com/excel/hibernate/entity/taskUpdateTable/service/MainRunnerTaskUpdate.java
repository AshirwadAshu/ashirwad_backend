package com.excel.hibernate.entity.taskUpdateTable.service;

import com.excel.hibernate.entity.serviceTasksTable.ServiceTask;
import com.excel.hibernate.entity.taskUpdateTable.TaskUpdate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunnerTaskUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("task_updates");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
	   TaskUpdate tu = new TaskUpdate();
		
		
		
		et.begin();
		em.persist(tu);
		et.commit();
		
		em.close();
	}

}
