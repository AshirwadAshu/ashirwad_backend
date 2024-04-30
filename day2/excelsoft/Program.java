package excelsoft;
import java.util.Arrays;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the size  ");
        int size = scanner.nextInt();
        
        
        int[] myArray = new int[size];
        
  
        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        Arrays.sort(myArray);
        
      
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(myArray[i] + " ");
            
        }
        
        
         
        
        scanner.close();
    }
}
