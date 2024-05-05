package practice;

public class Pattern30 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int c=1;
			for(int k=1;k<=i*2-1;k++) {

				if(k<i) {
					System.out.print(c+" ");
					c++;
				}
				else{

					System.out.print(c+" ");
					c--;
				}
			}
			System.out.println();
		}
	}

}

// 1 2 3 4 5 4 3 2 1 
//   1 2 3 4 3 2 1 
//     1 2 3 2 1 
//       1 2 1 
//         1 
