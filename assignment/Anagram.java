package practice;

import java.util.Arrays;

public class Anagram {
	
	static boolean isAnagram(String s1,String s2) {
		String temp ="";
		for(int i =0; i< s1.length();i++) {
			if(s1.charAt(i)!= ' ') {
				temp=temp + s1.charAt(i);
			}
		}
		
		s1=temp;
		
		
		String temp1 ="";
		for(int i =0; i< s2.length();i++) {
			if(s2.charAt(i)!= ' ') {
				temp1=temp1 + s2.charAt(i);
			}
		}
		s2=temp1;
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s1.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	   s1 = new String(arr1);
	   s2 = new String(arr2);
	   
	   return s1.equalsIgnoreCase(s2);
		
		
		
		
	}
	public static void main(String[] args) {
		String s1 = "Funeral";
		String s2 = "Real Fun";
		System.out.println(isAnagram(s1,s2));
}

}
