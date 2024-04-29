package excelsoft;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static int[] createArray(int size, Scanner scanner) {
        int[] newArray = new int[size];
        
        System.out.println("Enter array:");
        for (int i = 0; i < size; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }
    
    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        
        return reversedArray;
    }
    
    public static int[] sortArray(int[] array) {
      
        Arrays.sort(array);
        return array;
    }
    
    public static void printArray(int[] array) {
        for (int i=0 ; i<array.length;i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        
    }
    
    public static int[] mergeArray(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] mergedArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        return mergedArray;
    }
    public static int maxElement(int[] array) {
        
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
    
public static int minElement(int[] array) {
        
        int min = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
   

 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        int[] myArray = createArray(size, scanner);
        
        System.out.println("Array are");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
        
        int[] reversedArray = reverseArray(myArray);
        
        System.out.println("\nReversed array:");
        for (int i = 0; i < size; i++) {
            System.out.println(reversedArray[i] + " ");
        }
         
        int[] sortedArray = sortArray(reversedArray);
        System.out.println("Sorted array:");
        printArray(sortedArray);
        
        
        
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = createArray(size1, scanner);

        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = createArray(size2, scanner);

        System.out.println("First array:");
        printArray(array1);

        System.out.println("Second array:");
        printArray(array2);

        int[] mergedArray = mergeArray(array1, array2);
        System.out.print("Merged array:");
        printArray(mergedArray);
        
        
        
        System.out.println("Maximum element in the merged array: " + maxElement(mergedArray));
        
        System.out.println("Miniimum element in the merged array: " + minElement(mergedArray));
        
        
        
        

        scanner.close(); 
        
    }
}
