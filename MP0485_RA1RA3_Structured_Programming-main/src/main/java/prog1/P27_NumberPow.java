package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Type conversions</strong><br/>
 *   Program to calculate data with Math methods<br/>
 *   <img src="../../../../javadoc/resources/P27_NumberPow.png"/>
 * </div>
 */
public class P27_NumberPow {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int number = scanner.nextInt();
        int Square = (int) Math.pow(number, 2);
        int Cube = (int) Math.pow(number, 3);
        int Three = (int) Math.pow(number, 4);
        System.out.println (Square);
        System.out.println (Cube);
        System.out.println (Three);
        
        
        
        
        // Write your program here
        // Hint: Use Math.pow() to calculate powers of a number
        // Read number
                
        // Calculate pows using double format        

        // Print result of three pows as integer
                
        scanner.close();
    }
}
