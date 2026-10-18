package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P08_AbsoluteValue.png">
 */
public class P08_AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int num_persona = scanner.nextInt();
        
        if (num_persona <0){
            int num_arreglat = num_persona * -1;
            System.out.println(num_arreglat);
        }
        else {
            System.out.println(num_persona);
        }
        
        // Write your program here
        // Hint: Use if-else to print absolute value (negate if negative)
    }
}
