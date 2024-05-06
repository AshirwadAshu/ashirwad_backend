package day5;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Register<emps> {
	public static  <Employe> void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (o1).compareTo(o2);
			}
			
		};
		
		
		TreeMap<Integer,Employe> tm = new TreeMap<>(com);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int empId=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName=sc.next();
		System.out.println("Enter Employee dept:");
		String dept=sc.next();
		System.out.println("Enter Employee designation:");
		String designation=sc.next();
		tm.put(empId,new Employe(empId, empName, dept, designation));
		System.out.println("want to add more employees:");

		String value=sc.next();
		if(value.equalsIgnoreCase("no"))
			break;
	}
	Set<Entry> emp=tm.entrySet();
	for(Entry emps:emp) {
		System.out.println(emps.getKey()+" ==>"+emps.getValue());
		
		
		
		
	}
	}
}
