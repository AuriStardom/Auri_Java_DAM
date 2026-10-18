package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b>: flow control, date logic (fixed 30-day months)<br/>
 * <img src="../../../../javadoc/resources/P19_NextDate.png"/>
 */
public class P19_NextDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        
        
        
        if (month == 12 && day == 30) {
            int year_plus = year + 1;
            System.out.println ("1/1/" + year_plus);
        }
        else if (day == 30) {
            int month_plus = month + 1;
            System.out.println("1/" + month_plus + "/" + year);
        }
        else {
            int day_plus = day + 1;
            System.out.println (day_plus + "/" + month + "/" + year);
        }
        
        

        // Write your program here
        // Hint: Calculate next date handling day/month/year rollover (assume 30 days/month)
       
    }
}
