package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P21_AverageOfTwoNumbers.png"/>
 * </div>
 */
public class P21_AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        double number_one = scanner.nextDouble();
        System.out.println("Give the second number:");
        double number_two = scanner.nextDouble();
        double result = (number_one + number_two) / 2;
        System.out.println("The average is " + result);  

        // Write your program here
        // Hint: Calculate and print the average of two numbers

    }
}
