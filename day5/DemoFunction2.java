package day5;

import java.util.function.Function;

public class DemoFunction2 {
	public static void main(String[] args) {
		
        Function<Integer, Integer> half = a -> a / 2;
 
        half = half.andThen(a -> 3 * a);

        System.out.println(half.apply(10));
	}

}
