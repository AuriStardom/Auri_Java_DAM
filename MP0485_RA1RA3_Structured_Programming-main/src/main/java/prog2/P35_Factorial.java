package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P35_Factorial.png">
 */
public class P35_Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int answer = scanner.nextInt();
        int factorial =1;
        
        for (int i = 1; i <= answer; i++) {
           factorial = factorial * i;
        }
        if (factorial == 0) {
            System.out.println("Factorial: 1");
        }
        else {
        System.out.println("Factorial: " + factorial);
        }
        // Write your program here
        // Hint: Calculate factorial (n! = n * (n-1) * ... * 1) using a for loop
        
    }
}
