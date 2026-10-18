package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P23_SimpleCalculator.png"/>
 * </div>
 */
public class P23_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number_one = scanner.nextInt();
        System.out.println("Give the second number:");
        int number_two = scanner.nextInt();
        int result_addition = number_one + number_two;
        int result_difference = number_one - number_two;
        int result_product = number_one * number_two;
        double result_division = number_one / number_two;
        System.out.println(number_one + " + " + number_two + " = " + result_addition);
        System.out.println(number_one + " - " + number_two + " = " + result_difference);
        System.out.println(number_one + " * " + number_two + " = " + result_product);
        System.out.println(number_one + " / " + number_two + " = " + result_division);
        
        
        // Write your program here
        // Hint: Read two numbers and an operation, then calculate the result
    }
}
