package day4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Student {
	Integer id ;
	String name;
	Double marks;
	Integer age;
	
	
	public Student(Integer id, String name, Double marks, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}


	public Student(int studId, String studName, Double studMarks) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Marks=" + marks + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(marks, age, id, name);
	}


	@Override
	public boolean equals(Object o) {
		Student stud1=(Student) o;
		return this.hashCode()==stud1.hashCode();

	}
	
	public static void main(String[] args) {
		HashSet<Student> stud=new HashSet<Student>();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int studId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String studName=sc.next();
		System.out.println("Enter marks :");
		Double studMarks=sc.nextDouble();
		System.out.println("Enter age :");
		int studAge=sc.nextInt();
		stud.add(new Student(studId, studName, studMarks,studAge));
		System.out.println("want to add more :");

		String value=sc.next();
		if(value.equalsIgnoreCase("no")) 
			
		break;	
	}
		for(Student stud1:stud) {
			System.out.println(stud1);
		}
	
	
	}
}
