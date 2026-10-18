package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P25_SquareRootOfSum.png"/>
 * </div>
 */
public class P25_SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number_one = scanner.nextInt();
        int number_two= scanner.nextInt();
        int result_number = number_one + number_two;
        double squareRoot = Math.sqrt(result_number);
        System.out.println(squareRoot);
        
        // Write your program here
        // Hint: Read two numbers, sum them, and print the square root using Math.sqrt()
    }
}
