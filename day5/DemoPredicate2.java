package day5;

import java.util.function.Predicate;

public class DemoPredicate2 {
	public static void main(String[] args) {
		 Predicate<Integer> t1 = (i) -> i > 10; 
		  
	        Predicate<Integer> t2 = (i) -> i < 20; 
	        
	        
	        boolean result = t1.and(t2).test(15); 
	        System.out.println(result); 
	  
	         
	        boolean result2 = t1.and(t2).negate().test(15); 
	        System.out.println(result2); 
	}

}
