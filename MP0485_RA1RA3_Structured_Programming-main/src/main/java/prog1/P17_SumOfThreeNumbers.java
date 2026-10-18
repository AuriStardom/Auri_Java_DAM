package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P17_SumOfThreeNumbers.png"/>
 * </div>
 */
public class P17_SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number_one = scanner.nextInt();
        System.out.println("Give the second number:");
        int number_two = scanner.nextInt();
        System.out.println("Give the third number:");
        int number_three = scanner.nextInt();
        int result = number_one + number_two + number_three;
        System.out.println("The sum of the numbers is " + result);
        // Write your program here
        // Hint: Read three numbers and print their sum

    }
}
