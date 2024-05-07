package day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoRemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99,5);
		List<Integer> removeDuplicate = number.stream()
                 .distinct()
                 .collect(Collectors.toList()); 
System.out.println(removeDuplicate);
		
	}

}
