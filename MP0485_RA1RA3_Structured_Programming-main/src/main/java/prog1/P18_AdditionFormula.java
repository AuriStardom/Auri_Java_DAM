package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data <br/>
 *   <img src="../../../../javadoc/resources/P18_AdditionFormula.png"/>
 * </div>
 */
public class P18_AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Give the first number:");
        int number_one = scanner.nextInt();
        System.out.println("Give the second number:");
        int number_two = scanner.nextInt();
        int result = number_one + number_two;
        System.out.println(number_one + " + " + number_two + " = " + result);
        
        
        // Write your program here
        // Hint: Apply an addition formula (e.g., result = (a + b) * c)
    }
}
