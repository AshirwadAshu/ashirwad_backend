package excelsoft;

public class Patterns {

	public static void main(String[] args) {
		 /*int n = 5;
	        for (int i = 1; i <= n; i++) {
	        	int k =i;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(k++ + " ");
	            }
	            System.out.println();
	        }*/
	        
	       /* int n = 5;
	        for (int i = 1; i <= n; i++) {
	        	int k =i;
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*" + " ");
	            }
	            System.out.println();
	        }*/
	        
		
		
		/*int n = 5;
		
		int i, j;
		 
        for (i = n; i >= 1; i--) {
 
            
            for (j = 1; j <= i; j++) {
                System.out.print("*"+ " ");
            }
 
       
            System.out.println();
		  
        }*/
		
		
		/*int n = 5;
		
		int i, j;
		 
        for (i = n-1; i >= 0; i--) {
 
            
            for (j = 0; j <= i; j++) {
                System.out.print(j+1 + " ");
            }
 
       
            System.out.println();
		
	          
	        
        }*/
		
		
      /* int n = 5;
		
		int i, j;
		 
        for (i = n-1; i >= 0; i--) {
 
            
            for (j = 0; j <= i; j++) {
                System.out.print(i+1 + " ");
            }
 
       
            System.out.println();
		
	          
	        
        }*/
		
		
		 /*int size = 5;
		    int alpha = 65;

		    // printing square
		    for (int i = 0; i < size; i++) {
		      for (int j = 0; j < size; j++) {
		        System.out.print((char)(alpha+j));
		      }
		      System.out.println();
        
		    }*/
		
		
		/* int size = 5;
		    int alpha = 97;

		    // printing square
		    for (int i = 0; i < size; i++) {
		      for (int j = 0; j < size; j++) {
		        System.out.print((char)(alpha+j));
		      }
		      System.out.println();
        
        
		    }*/
		
		
	
	/*	int n = 5;
		
		int i, j;
		 
        for (i = n-1; i >= 0; i--) {
 
            
            for (j = 0; j <= i; j++) {
                System.out.print(i+1 + " ");
            }
 
       
            System.out.println();
		
	          
	        
        }*/
		
	/*int n = 5;
		
		for(int i =1; i<=n; i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		
	          
	        
        }*/
		
		
		/*int n = 5;
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		
	          
	        
        }*/
		
		
		
  /* int n = 5;
		
    for(int i=1;i<=n;i++) {
		for(int j=i;j>=1;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		
	          
	        
        }*/
		
		
		
		/*int n = 5;
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>=n-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		          
		        
	        }*/
		
		/*int n = 5;
		
		for(int i=1;i<n;i++) {
			for(int j=n;j>=n-i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		          
		        
	        }*/
		
		
		
		
		
		
		
	
		
		
		/*int n =5;
		 int i, j;
		 
	        
	         
        for(i=0; i<n; i++)  {
         for(j=2*(n-i); j>=0; j--) 
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
            }           
            System.out.println();
	        }*/
		
		
		
		
		/*int n =5;
		int i,j,k ;
		 for( i=1;i<=n;i++) {
				for( j=n-i-1;j>=0;j--) {
					System.out.print(" ");
				}
				for( k=1;k<=i*2-1;k++) {

					System.out.print("*" + " " );
				}
				System.out.println();
			}*/
	        
		 
		/* int n =5;
			int i,j,k ;
			 for( i=1;i<=n;i++) {
					for( j=n-i-1;j>=0;j--) {
						System.out.print(" ");
					}
					for( k=1;k<=i*2-1;k++) {

						System.out.print("*");
					}
					System.out.println();
				}*/
			 
			 
			 
			 
			/* int n =5;
				int i,j,k ;
				 for( i=1;i<=n;i++) {
						for( j=n-i-1;j>=0;j--) {
							System.out.print(" ");
						}
						for( k=1;k<=i*2-1;k++) {

							System.out.print(i%2);
						}
						System.out.println();
					}*/
		
		
		
 //         1		 
//		   101
//		  10101
//		 1010101
//		101010101
	
		/*int n =5;
		int i,j,k=1 ;
		 for( i=1;i<=n;i++) {
				for( j=n-i-1;j>=0;j--) {
					System.out.print(" ");
				}
				for( k=1;k<=i*2-1;k++) {

					System.out.print(k%2);
				}
				System.out.println();
			}*/
		
		
		 
		 
		 
		 
		 
		
	/*	int n =5;
		int i,j,k ;
		
	    for ( i = 0; i < n; i++) {
	      
	      for ( j = 0; j < i; j++) {
	        System.out.print(" ");
	      }
	     
	      for ( k = 0; k < 2 * (n - i) - 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	      
			}*/
		
		
		/*int n= 5;
		 int i, j, k = 1;
         for (i = 1; i <= n; i++) {
             for (j = 1; j< i + 1; j++) {
                 System.out.print(k++ + " ");
             }
    
             System.out.println();
             
         }*/
	
		
		

	
		
		

        

		
		
		
        
       
        
        
        
        
        
        
        
        
	}
}

	        		

		



