package excelsoft;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortBySalary {

	public static void main(String[] args) {
		List<Employee> employees=new LinkedList<Employee>();
		employees.add(new Employee(2,"jhon",5000));
		employees.add(new Employee(4,"oliver",7000));
		employees.add(new Employee(1,"bob",6000));
		employees.add(new Employee(5,"joh",4500));
		Collections.sort(employees,(e2,e1) ->e1.getSalary().compareTo(e2.getSalary()));
		for(Employee e:employees) {
			System.out.println(e);
	}

	}
}
