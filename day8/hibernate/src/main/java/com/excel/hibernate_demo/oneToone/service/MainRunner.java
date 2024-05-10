package com.excel.hibernate_demo.oneToone.service;

import com.excel.hibernate_demo.oneToone.MarkCard;
import com.excel.hibernate_demo.oneToone.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	
	public static void main(String[] args) {
		
		 factory = Persistence.createEntityManagerFactory("student");
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		 
		 MarkCard card = new  MarkCard();
		 card.setName("A");
		 card.setMarks(90);
		 
		 
		 Student st = new Student();
		 st.setName("nithi");
		 st.setAge(26);
		 card.setStudent(st);
		 st.setMarkcard(card);
		 
		 transaction.begin();
		manager.persist(st);
		transaction.commit();	
		
		manager.close();
	}

}
