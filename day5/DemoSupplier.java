package day5;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DemoSupplier {
	public static void main(String[] args) {
		 
		 // Supplier<String> supplier= ()-> "Arpit";
		  //System.out.println(supplier.get());
		
		Supplier < LocalDateTime > supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
		
		 }
		}


