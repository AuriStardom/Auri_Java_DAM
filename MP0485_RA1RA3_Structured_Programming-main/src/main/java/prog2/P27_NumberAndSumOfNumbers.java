package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P27_NumberAndSumOfNumbers.png">
 */
public class P27_NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int answer = 4;
        int loop_num = 0;
        int loop_times = 0;
        do {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer != 0) {
                loop_times++;
                loop_num = loop_num + answer; 
            }
            
        } while (answer !=0);
        System.out.println("Number of numbers: " + loop_times);
        System.out.println("Sum of the numbers: " + loop_num);
        
        
        // Write your program here
        // Hint: Use do-while to read numbers and print count and sum
        
    }
}
