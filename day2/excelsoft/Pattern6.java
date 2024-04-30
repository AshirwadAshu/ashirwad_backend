package excelsoft;

public class Pattern6 {
	public static void main(String[] args) {
		int size = 5;
	    int alpha = 65;

	    
	    for (int i = 0; i < size; i++) {
	      for (int j = 0; j < size; j++) {
	        System.out.print((char)(alpha+j) +" ");
	      }
	      System.out.println();
    
	    }
	}

}

//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
