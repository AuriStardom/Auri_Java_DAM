package main.java.prog1;

import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Reading different data</strong><br/>
 *   Program to input different data as a part of output <br/>
 *   <img src="../../../../javadoc/resources/P14_DifferentTypesOfInput.png"/>
 * </div>
 */
public class P14_DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        System.out.println("Give an integer:");
        int integer = scan.nextInt();
        
        System.out.println("Give a double:");
        double Double = scan.nextDouble();
       
        System.out.println("Give a boolean:");
        boolean Boolean = scan.nextBoolean();        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + Double);
        System.out.println("You gave the boolean " + Boolean);
                

        // Write your program here
        // Hint: Read different data types (int, double, String, boolean) and print them

    }
}
