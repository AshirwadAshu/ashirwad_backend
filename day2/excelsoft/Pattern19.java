package excelsoft;

public class Pattern19 {
	public static void main(String[] args) {
		int n =5;
		int i,j,k ;
		
	    for ( i = 0; i < n; i++) {
	      
	      for ( j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	     
	      for ( k = 0; k < 2 * (n - i) - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	      
			}
	}

}
