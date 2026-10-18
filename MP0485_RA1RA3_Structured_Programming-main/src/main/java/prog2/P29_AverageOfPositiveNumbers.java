package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P29_AverageOfPositiveNumbers.png">
 */
public class P29_AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 0;
        double loop_positive = 0;
        int looptimes = 0;
        
        do {            
            answer = scanner.nextInt();
            if (answer > 0) {
                loop_positive = loop_positive + answer;
                looptimes++;
            }
        } while (answer !=0);
        
        if (looptimes == 0) {
            System.out.println("Cannot calculate the average");
        }
        else{
        double avg = loop_positive / looptimes;
        
        if (avg <0) {
            
        System.out.println("Cannot calculate the average");
        }
        else {
            System.out.println(avg);
        }
    }
        // Write your program here
        // Hint: Calculate average of only positive numbers input
        
    }
}
