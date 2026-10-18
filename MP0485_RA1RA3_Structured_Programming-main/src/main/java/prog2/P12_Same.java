package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P12_Same.png">
 */
public class P12_Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String string1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scan.nextLine();
        
        int result = string1.compareTo(string2);
        if (result == 0){
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }

        // Write your program here
        // Hint: Check if two input strings are identical
    }
}
