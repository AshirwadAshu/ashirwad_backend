package day6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoFrequncyOfEachElementArray {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
				Map<Integer, Long> freq=number.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(freq);
	}

}
