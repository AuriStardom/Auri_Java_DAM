package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P33_SumOfASequence.png">
 */
public class P33_SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int calculus = 0;
        int sum_num = 0;
        
        System.out.println("Last number?");
        int lastnum = scanner.nextInt();
        
        while (calculus < lastnum) {
            calculus++;
            sum_num = sum_num + calculus;
        }
        System.out.println("The sum is " + sum_num);
        
        

        // Write your program here
        // Hint: Calculate sum of numbers in a sequence using a for loop
       
    }
}
