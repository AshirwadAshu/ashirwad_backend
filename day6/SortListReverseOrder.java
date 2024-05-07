package day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListReverseOrder {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

		System.out.println(list);
		System.out.println(sortedList);
	}

}
