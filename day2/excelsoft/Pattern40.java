package practice;

public class Pattern40 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+","+i+" ");
			}
			System.out.println();
		}
	}
}

//1,2 2,2 3,2 4,2 5,2 
//1,3 2,3 3,3 4,3 5,3 
//1,4 2,4 3,4 4,4 5,4 
//1,5 2,5 3,5 4,5 5,5 