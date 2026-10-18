package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P45_Swap.png">
 */
public class P45_Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int [] numbers = {1, 3, 5, 7, 9,};

        
        System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + "," + numbers[4] + ",");
        System.out.println("Give the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Give the second number:");
        int num2 = scanner.nextInt();
        System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3] + "," + numbers[4] + ",");
        
        
        // Write your program here
        // Hint: Read two array indices and swap their values
        
    }

}
