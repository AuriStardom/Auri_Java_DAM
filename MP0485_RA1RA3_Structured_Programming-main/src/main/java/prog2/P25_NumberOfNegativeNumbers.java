package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P25_NumberOfNegativeNumbers.png">
 */
public class P25_NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 3;
        int loop = 0;
        
        do {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer != 0 && answer < 0){
            loop++;
            }
        }
        while (answer != 0);
        System.out.println("Number of negative numbers: " + loop);
        
        // Write your program here
        // Hint: Count negative numbers until user enters 0
        
    }
}
