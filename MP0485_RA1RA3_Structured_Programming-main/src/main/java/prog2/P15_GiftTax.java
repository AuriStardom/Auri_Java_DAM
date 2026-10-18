package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, logical operator <hr/><br/>
 * <img src="../../../../javadoc/resources/P15_GiftTax.png">
 */
public class P15_GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift_price = scan.nextInt();
        
        if (gift_price < 5000){
            System.out.println("No tax!");
        }
        if (gift_price >= 5000 && gift_price < 25000){
            double result = (100+(gift_price-5000)*0.08);
            System.out.println("Tax: " + result);
        }
        if (gift_price >= 25000 && gift_price < 55000) {
            double result = (1700+(gift_price-25000)*0.10);
            System.out.println("Tax: " + result);
        }
        if (gift_price >= 55000 && gift_price <200000) {
            double result = (4700+(gift_price-55000)*0.12);
            System.out.println("Tax: " + result);
        }
           if (gift_price >= 200000 && gift_price <1000000) {
            double result = (22100+(gift_price-200000)*0.15);
            System.out.println("Tax: " + result);
        }
           if (gift_price > 1000000) {
            double result = (142100+(gift_price-1000000)*0.17);
            System.out.println("Tax: " + result);
        }
        
        // Write your program here
        // Hint: Calculate gift tax based on amount thresholds using if-else
    }
}
