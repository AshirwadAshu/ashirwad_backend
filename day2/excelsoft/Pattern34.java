package practice;

public class Pattern34 {
	public static void main(String[] args) {
		int n=7;
		int a=0,s=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("  ");
			}
			int x=1;
			for(int k=1;k<=s;k++) {
				System.out.print(x+" ");
				if(k<=s/2)
					x++;
				else
					x--;
			}
			if(i<=n/2) {
				a++;
				s=s-2;
			}
			else {
				a--;
				s=s+2;
			}
			System.out.println();
		}
	}
}

//1 2 3 4 3 2 1 
//  1 2 3 2 1 
//    1 2 1 
//      1 
//    1 2 1 
//  1 2 3 2 1 
//1 2 3 4 3 2 1 

