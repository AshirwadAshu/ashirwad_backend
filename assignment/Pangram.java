package practice;

public class Pangram {
	static boolean isPangram(String s) {
	
	String t ="abcdefghijklmnopqrstuvwxyz";
	s = s.toLowerCase();
	System.out.println(s);
	int count =0;
	for(int i =0; i< t.length();i++) {
		if(s.indexOf(t.charAt(i))>=0) 
			count++;
		else 
			break;
		
	}
	System.out.println(count);
		if(count== 26) {
			return true;
		}else {
			return false;
		
		}
	}
	public static void main(String[] args) {
		String s ="A quick brown fox jumps over the lazy dog";
				
				System.out.println(isPangram(s));
	
}
}