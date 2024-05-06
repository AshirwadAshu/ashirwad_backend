package day5;

import java.util.Iterator;
import java.util.LinkedHashMap;



public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> employe = new LinkedHashMap();
		
		employe.put("Jhon",101);
		employe.put("oliver",102);
		employe.put("Antony",103);
		employe.put("Bob",104);
		
	
		
	
		
	
		Iterator<String> iterator = employe.keySet().iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			
			
			System.out.println("Name : " + employe.keySet() );
			
			System.out.println("Id  :" + employe.values());

	}
	
	
	
	
	
	
	}
}
