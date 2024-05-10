package com.excel.hibernate_demo.manyTomany.service;


import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate_demo.manyTomany.Book;

import com.excel.hibernate_demo.manyTomany.Student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book> books = new ArrayList<>();
		List<Student1> students = new ArrayList<>();
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		Student1 st1 = new Student1();
		Student1 st2 = new Student1();
		Student1 st3 = new Student1();
		
		b1.setTitle("One day life will change");
		b1.setStudents(students);
		
		b2.setTitle("you are my best friend");
		b2.setStudents(students);
		
		b3.setTitle("cosmos");
		b3.setStudents(students);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);

		st1.setName("John");
		st1.setAge(32);
		st1.setBooks(books);
		
		st2.setName("Oliver");
		st2.setAge(30);
		st2.setBooks(books);
		
		st3.setName("Rohan");
		st3.setAge(23);
		st3.setBooks(books);
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		
		transaction.begin();
		manager.persist(st3);
		transaction.commit();
		
		manager.close();
	}
}


