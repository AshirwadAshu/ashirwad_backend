package day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOddNumber {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		List<Integer> oddNumbers = number.stream()
                .filter(i -> i % 2 != 0).
                 collect(Collectors.toList());
System.out.println(oddNumbers);

}
}