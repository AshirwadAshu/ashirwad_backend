package practice;

public class Pattern33 {
	public static void main(String[] args) {
		int n=7;
		int a=0,s=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=s;j++) {
				System.out.print("*");
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

//*******
// *****
//  ***
//   *
//  ***
// *****
//*******

