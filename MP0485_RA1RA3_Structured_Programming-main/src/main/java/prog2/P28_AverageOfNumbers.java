package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, do while loops <hr/><br/>
 * <img src="../../../../javadoc/resources/P28_AverageOfNumbers.png">
 */
public class P28_AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int answer = 4;
        double loop = 0;
        int loop_times = 0;
        
        do {            
            System.out.println("Give a number:");
            answer = scanner.nextInt();
            if (answer !=0) {
                loop = loop + answer;
                loop_times++;
            }
        } while (answer !=0);
        double avg = loop / loop_times;
        if (loop == 0) {
            System.out.println("Average of the numbers: 0.0");
        }
        else {
        System.out.println("Average of the numbers: " + avg);
        }

        // Write your program here
        // Hint: Use do-while loop to read numbers and calculate average
        
    }
}
