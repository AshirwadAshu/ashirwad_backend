package day5;

import java.util.function.Supplier;

public class DemoSupplier1 {
	 public static void main(String[] args) {
	 
	 Supplier<Double> rondomValue = () -> Math.random();
	 
	 System.out.println(rondomValue.get());
	 }
	 
	 }
