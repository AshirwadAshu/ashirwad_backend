package day5;

import java.util.function.Function;

public class DemoFucation1 {
	public static void main(String[] args) {
		Function<Integer, Integer> half = a -> a /2;
		 System.out.println(half.apply(40));
	}

}
