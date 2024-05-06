package day5;

import java.util.function.Predicate;

public class DemoPredicate3 {
	static void pred(int number, Predicate<Integer> predicate) 
    { 
        if (predicate.test(number)) { 
            System.out.println("Number " + number); 
        } 
    } 
	public static void main(String[] args) {
		 pred(6, (i) -> i > 0); 
		
	}

}
