package excelsoft;

public class Pattern18 {
	public static void main(String[] args) {
		int n =5;
		int i,j,k=1 ;
		 for( i=1;i<=n;i++) {
				for( j=n-i-1;j>=0;j--) {
					System.out.print(" ");
				}
				for( k=1;k<=i*2-1;k++) {

					System.out.print(k%2);
				}
				System.out.println();
			}
	}

}
