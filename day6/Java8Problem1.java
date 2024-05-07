package day6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Problem1 {
	private static Collection<Integer> asList;

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
	
		
	// three Max and min	
//	System.out.println("=========>");
//	
//	int[] d = { 10 , 20 , 30 , 40 };
//	int[] e = { 50 , 30 , 70 , 80 };
//	IntStream.concat(Arrays.stream(d),Arrays.stream(e)).sorted().forEach(System.out::println);
//	asList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		
		
		
 //sum and average element of an array
		System.out.println("=========>");
		
		Integer sum=Arrays.stream(a).sum();
				System.out.println(sum);		
	//Average of all the elements in the array
			Double avg=	Arrays.stream(a).average().getAsDouble();
			System.out.println(avg);
		
			
			
		
		
		
//Reverse an Integer Array
		
		System.out.println("==========>");
		int[] c = { 10 , 20 , 30 , 40 };
		IntStream.rangeClosed(1, c.length).map(i->c[c.length-i]).forEach(System.out::println);
		
		
		
//String Palindrome check
		System.out.println("============>");
			String str="malayalam";
			boolean res	=IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
			System.out.println(res);
		
			
			
			
			
			
//Last Element of an array
		System.out.println("============>");		
		List<String> names = new ArrayList<>(Arrays.asList("b","a","z","p"));
		String last=names.stream().skip(names.size()-1).findFirst().get();
	     System.out.println(last);
		     
		     
		 
	     
	     
		     
 //check person age in years
	     System.out.println("===========>");
		LocalDate birthday=LocalDate.of(2001, 7, 14);
		LocalDate today=LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthday, today));
		
		
		
		
// Anagram string
		System.out.println("=============>");
		String str1 = "Fun real";
		String str2 = "realFun";
		
		str1 = Stream.of(str1.split(" ")).map(String :: toUpperCase).sorted().collect(Collectors.joining());
		String collect2 = Stream.of(str2.split(" ")).map(String :: toUpperCase).sorted().collect(Collectors.joining());
		
		Boolean option=Optional.ofNullable(str1).map(e ->e.equals(collect2)).get();
		System.out.println(option);

		
		
	// second largest number in integer array
		System.out.println("========================>");
		List<Integer> number = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);
		Integer listOfInteger = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(listOfInteger);
		
	
// common element between two array
		System.out.println("===================>");
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

		List<Integer> finalList =  list1.stream().filter(item-> !list2.contains(item)).collect(Collectors.toList());

		finalList.stream().forEach(System.out::print);
		
		
// reverse a each word of string 
		System.out.println("==========>");
		String input = "Fun real";
		 String result = Arrays.stream(input.split(" "))
                 .map(word -> new StringBuilder(word).reverse().toString()) 
                 .collect(Collectors.joining(" "));
		 
		 System.out.println(input);
		 System.out.println(result);
		 
		 
		 
		// find String starts with number
		 System.out.println("==================>");
		
		 List<String> names1 = new ArrayList<>(Arrays.asList("1b","2a","z","p"));
			names1.stream().filter(str5->Character.isDigit(str.charAt(0))).forEach(System.out::println);
			System.out.println(names1);
		
		
	}

}

	   
	    
	   
		
	