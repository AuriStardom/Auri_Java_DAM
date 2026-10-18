package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P42_NumberReaderReverse.png">
 */
public class P42_NumberReaderReverse {
    public static void main(String[] args) {
       
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers [i] = scanner.nextInt();
        }
        System.out.println("The numbers (in reverse order):");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers [i]);
        }
        
        
        
        // Write your program here
        // Hint: Read array size, create array, fill it, then print in reverse order
        
    }
}
