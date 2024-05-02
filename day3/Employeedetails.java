package excelsoft;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Employeedetails {

	public static void main(String[] args) {
		
		List<Employee> employees=new LinkedList<Employee>();
		employees.add(new Employee(2,"jhon",5000));
		employees.add(new Employee(4,"oliver",700));
		employees.add(new Employee(1,"bob",6000));
		employees.add(new Employee(5,"jhon",400));
		Collections.sort(employees);
		for(Employee e:employees) {
			System.out.println(e);
		}
	}
		
}

	

