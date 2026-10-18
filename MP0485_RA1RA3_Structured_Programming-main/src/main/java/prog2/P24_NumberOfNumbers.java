package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P24_NumberOfNumbers.png">
 */
public class P24_NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int answer = 3;
        int loop = 0;
        
        do {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer != 0){
            loop++;
            }
        }
        while (answer != 0);
        System.out.println("Number of numbers: " + loop);
        
        
        
        // Write your program here
        // Hint: Count how many numbers are input until user enters 0
        
    }
}
