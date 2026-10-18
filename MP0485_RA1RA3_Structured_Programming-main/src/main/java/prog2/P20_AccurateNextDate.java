package main.java.prog2;

import java.time.Year;
import java.util.Scanner;

/**
 * <b>Content</b> flow control, date logic with Year class <hr/><br/>
 * <img src="../../../../javadoc/resources/P20_AccurateNextDate.png">
 */
public class P20_AccurateNextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        
        int month_plus = month + 1;
        int day_plus = day + 1;
        int year_plus = year + 1;
      
        
        switch (month) {
                    case 1: 
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 2:
                        if (Year.isLeap(year) && day == 29){
                            System.out.println("1" + "/" + month_plus + "/" + year);
                        }
                        else if (day == 28) {
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 3:
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 4:
                        if (day == 30){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 5:
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                    case 6:
                        if (day == 30){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 7:
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                    case 8:
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 9:
                        if (day == 30){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 10:
                        if (day == 31){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 11:
                        if (day == 30){
                            System.out.println("1/" + month_plus + "/" + year);
                        }
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                    case 12:
                        if (day == 31){
                            if (year_plus==0) {
                                year_plus=1;
                            } 
                            System.out.println("1/" + 1  + "/" + year_plus);
                        }
                        
                        else {
                            System.out.println(day_plus + "/" + month + "/" + year);
                        }
                        break;
                          }
                        
            
            
        
        // Write your program here
        // Hint: Use Year.isLeap() to calculate accurate next date with proper month lengths
        
    }    
}
