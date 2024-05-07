package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringIncreasingOrder {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("b","a","z","p"));
		list = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}

}
