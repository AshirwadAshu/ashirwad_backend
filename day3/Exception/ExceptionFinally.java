package excelsoft;

public class ExceptionFinally {
public static void main(String[] args) {
	try {
		int d=0/25;
		
	}catch(ArithmeticException e)  
    {  
        System.out.println("Arithmetic Exception occurs");  
       }    
	
	
	catch(NullPointerException e) {
		System.out.print("null pointer exception");
	}finally {
		System.out.println("finally block");
	}
	
	System.out.println("Reset code");
}
}
