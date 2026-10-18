package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P09_ComparingNumbers.png">
 */
public class P09_ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
        if (num1 < num2){
            System.out.println(num1 + " is smaller than " + num2 + ".");
        }
        if (num1 == num2){
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
        
        
        // Write your program here
        // Hint: Compare three numbers and print the largest one
    }
}
