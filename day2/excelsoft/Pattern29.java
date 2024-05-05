package practice;

public class Pattern29 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int a=65+i-1;
			for(int k=1;k<=i*2-1;k++) {

				if(k<i) {
					System.out.print((char)a+" ");
					a--;
				}
				else{

					System.out.print((char)a+" ");
					a++;
				}
			}
			System.out.println();
		}
	}

}

//         A 
//       B A B 
//     C B A B C 
//   D C B A B C D 
// E D C B A B C D E 


