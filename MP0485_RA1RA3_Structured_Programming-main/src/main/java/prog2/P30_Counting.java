package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P30_Counting.png">
 */
public class P30_Counting {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        int answer = scanner.nextInt();
        int number = -1;
        while (number < answer) {
            number++;
            System.out.println(number);
        }
        
        
        // Write your program here
        // Hint: Print numbers from 1 to n using a for loop
        
    }
}
