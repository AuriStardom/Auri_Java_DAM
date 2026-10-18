package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P26_SumOfNumbers.png">
 */
public class P26_SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 4;
        int loop = 0;
        
        do {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer !=0) {
                loop = loop + answer;
            }
        }
        while (answer != 0);
        System.out.println("Sum of the numbers: " +  loop);
        
        
        
        
        
        
        
        // Write your program here
        // Hint: Sum all input numbers until user enters 0
        
    }
}
