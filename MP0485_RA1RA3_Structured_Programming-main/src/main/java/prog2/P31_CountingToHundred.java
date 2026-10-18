package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P31_CountingToHundred.png">
 */
public class P31_CountingToHundred {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        int answer = scanner.nextInt();
        
        System.out.println(answer);
        while (answer <100) {
            answer++;
            System.out.println(answer);
        }
        
            
        
        // Write your program here
        // Hint: Sum numbers from 1 to 100 using a for loop
    }
}
