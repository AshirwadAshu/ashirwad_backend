package excelsoft;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortById {

	public static void main(String[] args) {
		List<Employee> employees=new LinkedList<Employee>();
		employees.add(new Employee(2,"jhon",56));
		employees.add(new Employee(4,"oliver",78));
		employees.add(new Employee(1,"bob",63));
		employees.add(new Employee(5,"joh",35));
		Collections.sort(employees,(e1,e2) -> e1.getId()-e2.getId());
		for(Employee e:employees) {
			System.out.println(e);
	}

	}
}