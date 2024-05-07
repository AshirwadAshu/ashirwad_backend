package day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;



public class MergeTwoUnsortedArray {
	public static void main(String[] args) {
		int[] a = { 10 , 20 , 30 , 40 };
		int[] b = { 50 , 30 , 70 , 80 };
//marge two unsorted array 
		int[] merged = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();
		
		System.out.println(Arrays.toString(merged));
		
		
		System.out.println("=====================>");
		
//marge two unsorted array without duplicate		
		
		int[] merge = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();

		System.out.println(Arrays.toString(merge));
		
	//marge 	
	}

}
