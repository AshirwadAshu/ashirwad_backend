package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoMinmumValue {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		Integer listOfmin = number.stream().min(Comparator.naturalOrder()).get();
		System.out.println(listOfmin);
		
	}

}
