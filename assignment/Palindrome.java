package practice;

public class Palindrome {
	
	static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i)!= s.charAt(j)) {
				return false;
			}
		}
			return true;
		
	}
public static void main(String[] args) {
	
	String s = "MALAYALAM";
	System.out.println(isPalindrome(s));
	
}
}



