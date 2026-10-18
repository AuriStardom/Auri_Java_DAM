package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P16_CounterDigits.png">
 */
public class P16_CounterDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 99,999:");
        int num = scanner.nextInt();
        
        if (num < 0 || num > 99999){
            System.out.println("Number out of range.");
        }
        if (num >= 0 && num <10){
            System.out.println("It has 1 digit.");
        }
        if (num >=10 && num <100){
            System.out.println("It has 2 digits.");
        }
        if (num >=100 && num <1000){
            System.out.println("It has 3 digits.");
        }
        if (num >=1000 && num <10000){
            System.out.println("It has 4 digits.");
        }
        if (num >=10000 && num <=99999){
            System.out.println("It has 5 digits.");
        }
        
        
        
        // Write your program here
        // Hint: Count digits by dividing by 10 in a loop until number becomes 0
    }
}

