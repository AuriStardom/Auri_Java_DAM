package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P22_AverageOfThreeNumbers.png"/>
 * </div>
 */
public class P22_AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        double number_one = scanner.nextDouble();
        System.out.println("Give the second number:");
        double number_two = scanner.nextDouble();
        System.out.println("Give the third number:");
        double number_three = scanner.nextDouble();
        double result = (number_one + number_two + number_three) / 3;
        System.out.println("The average is " + result);

        // Write your program here
        // Hint: Calculate and print the average of three numbers
    }
}
