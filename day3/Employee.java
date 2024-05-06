package excelsoft;


import java.util.*;

import day4.Student;
	class Employee implements Comparable<Employee> {
		private int id;
		private String Name;
		private int salary;
		public Employee(int id, String name, Integer i) {
			super();
			this.id = id;
			Name = name;
			this.salary = i;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee o) {
			
			return this.id-o.id;
		}
			
			public  int hashCode() {
				return this.id;
			}
			@Override
			public boolean equals(Object o) {
				Employee emp=(Employee) o;
				return this.hashCode()==emp.hashCode();

			}
		
		
		
	}
	



