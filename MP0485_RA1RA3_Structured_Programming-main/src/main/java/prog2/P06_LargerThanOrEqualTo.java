package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P06_LargerThanOrEqualTo.png">
 */
public class P06_LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num_1 = scan.nextInt();
        System.out.println("Give the second number:");
        int num_2 = scan.nextInt();
        if (num_1 > num_2){
        System.out.println("greater number is: " + num_1);
    }
        if (num_1 == num_2){
            System.out.println("The numbers are equal!");
        }
        else{
            System.out.println("greater number is: " + num_2);
        }
        
        // Write your program here
        // Hint: Compare two numbers and check if first is >= second
    }
}
