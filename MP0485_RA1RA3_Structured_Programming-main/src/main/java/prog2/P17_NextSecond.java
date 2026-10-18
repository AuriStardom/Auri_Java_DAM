package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, conditional, time logic <hr/><br/>
 * <img src="../../../../javadoc/resources/P17_NextSecond.png">
 */
public class P17_NextSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter hours:");
        int hour = scanner.nextInt();
        System.out.println("Enter minutes:");
        int minute = scanner.nextInt();
        System.out.println("Enter seconds:");
        int second = scanner.nextInt();
        
        
        if (hour == 23 && minute == 59 && second == 59) {
            System.out.println("Time: 0:0:0");
        }
        else if (minute == 59 && second == 59){
            int hour_plus = hour +1;
            System.out.println("Time: " + hour_plus + ":0:0");
        }
        else if (second == 59){
            int minute_plus = minute +1;
            System.out.println("Time: " + hour + ":" + minute_plus + ":0");
        }
        else {
            int second_plus = second +1;
            System.out.println("Time: " + hour + ":" + minute + ":" + second_plus);
        }
        
        
        
        // Write your program here
        // Hint: Calculate next second, handling rollover at 60 seconds
    }
}
