package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P22_AreWeThereYet.png">
 */
public class P22_AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 0;
       
        while (answer != 4) {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            
        }
        
        // Write your program here
        // Hint: Loop until user enters the target location name
       
    }
}
