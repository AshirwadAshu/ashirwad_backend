package day6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Problem {
	public static void main(String[] args) {
//		List<Number> asList = Arrays.asList(1,2,35,56,137.8,6,9,35);
//		
//		List<Integer>collect = asList.stream().filter(e -> e%2==0).collect(Collectors.to);
//		System.out.println(collect);
		
		
		//asList.stream().map(e -> e+"").filter(e -> e.startsWith("1"))
		//.forEach(System.out::println);
		
		//Set<Integer>set = new HashSet();
		//asList.stream().filter(e -> !set.add(e)).forEach(System.out::println);
		
		//Integer orElse = (Integer) asList.stream().findFirst().orElse(0);
		//System.out.println(orElse);
		
		//System.out.println(asList.stream().distinct().count());
		
	//Integer integer	=(Integer) asList.stream().max((o1,o2) -> o1.compareTo(o2)).get();
	//	System.out.println(integer);
		
		
//		String input = "Java articles are Awesome";
//	  Character character =    input.chars().mapToObj(c ->(char) c)
//			  .filter(e -> input.indexOf(e)==input.lastIndexOf(e))
//			  .findFirst().get();		
//	          System.out.println(character);
		
		
		
//		String input = "Java articles are Awesome";
//		  Character character =    input.chars().mapToObj(c ->(char) c)
//			  .filter(e -> input.indexOf(e)!=input.lastIndexOf(e))
//				  .findFirst().get();		
//	          System.out.println(character);
		
		
	//	asList.stream().sorted().forEach(System.out::println);
		
		
		
//		asList.stream().sorted(Collection.reverseOreder()).forEach(System.out::println);
//		
//	int size =asList.stream().distinct().collect(Collectors.toList()).size();
//	System.out.println(size != asList.size());
		
		
		
//		asList.stream().map(e -> e*e*e).filter(e -> e > 50).forEach(System.out::println);
		
		
//		String input = "asddjklasdjklk";
//	Map<Character , Long> collect	=input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//	System.out.println(collect);
		
		
//		
//		List<String> names = Arrays.asList("AA","BB","AA","CC");
//		names.stream().filter(e -> Collections.frequency(names, e)>1)
//		.collect(Collectors.groupingBy(Fuction.identity(0),Collectors.counting())
//		.forEach(str,count) -> System.out.println(str + "====>" + count);
//		
		
		
		
		
	
	}

}
