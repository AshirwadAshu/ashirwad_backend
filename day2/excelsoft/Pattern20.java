package excelsoft;

public class Pattern20 {
	public static void main(String[] args) {
		int n= 5;
		 int i, j, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j< i + 1; j++) {
                System.out.print(k++ + " ");
            }
   
            System.out.println();
            
        }
	}

}
