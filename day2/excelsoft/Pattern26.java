package practice;

public class Pattern26 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int a=n-i+1;
			for(int k=1;k<=i*2-1;k++) {

				if(k<i) {
					System.out.print(a+" ");
					a++;
				}
				else{

					System.out.print(a+" ");
					a--;
				}
			}
			System.out.println();
		}
	}
}
 //         5 
//        4 5 4 
//      3 4 5 4 3 
//    2 3 4 5 4 3 2 
//  1 2 3 4 5 4 3 2 1 

