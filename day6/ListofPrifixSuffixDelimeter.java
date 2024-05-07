package day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListofPrifixSuffixDelimeter {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Delimeter", "Prifix", "Suffix");
		
		String chString= str.stream().collect(Collectors.joining());	
	          System.out.println(chString);
	}

}
