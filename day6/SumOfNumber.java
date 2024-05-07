package day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumber {
	public static void main(String[] args) {
		List<Integer> number1 = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		Integer sum = number1.stream()
				  .collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
	}

}
