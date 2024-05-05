package practice;

public class Pattern37 {
	public static void main(String[] args) {
		int n=7;
		int a=n/2,s=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=a;j++) 
			{	
				System.out.print("  ");
			}
			int x=s/2+1;
			for(int j=1;j<=s;j++)
			{
				System.out.print(x+" ");
				if(j<=s/2)
					x--;
				else
					x++;
			}
			if(i<=n/2)
			{
				a--;
				s=s+2;
			}
			else {
				a++;
				s=s-2;
			}

			System.out.println();
		}
	}
}

//      1 
//    2 1 2 
//  3 2 1 2 3 
//4 3 2 1 2 3 4 
//  3 2 1 2 3 
//    2 1 2 
//      1 
