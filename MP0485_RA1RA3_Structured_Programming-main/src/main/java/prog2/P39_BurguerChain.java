package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P39_BurguerChain.png">
 */
public class P39_BurguerChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restaurants = 3;
        int days = 7;
        int salessum = 0;
        int sales = 0;

        System.out.println("Weekly Burger Sales Report");
        System.out.println();
        
        for (restaurants = 1; restaurants <= 3; restaurants++) {
            salessum = 0;
            System.out.println("Restaurant " + restaurants + ":");
            for (days = 1; days <=7; days++) {
                System.out.println("Enter sales for day " + days + ":");
                sales = scanner.nextInt();
                if (sales >= 50) {
                System.out.println(sales);
                }
                else {
                    System.out.println(sales + "!");
                }
                salessum = salessum + sales;
            }
            System.out.println("Total: " + salessum + " burgers"); 
        }
        
        

        // Write your program here
        // Hint: Use nested loops to display restaurant sales for each day
        
    }
}
