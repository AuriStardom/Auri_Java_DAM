package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P23_OnlyPositives.png">
 */
public class P23_OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 3;
        
        while (answer !=0) {
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer < 0) {
                System.out.println("Unsuitable number");
            }
            else if (answer > 0){
            int mult = answer * answer;
            System.out.println(mult);
            }
        }
        
        // Write your program here
        // Hint: Read numbers in loop and stop when user enters non-positive (0 or negative)
        
    }
}
