package main.java.prog1;

import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P45_WeeklySales.png"/>
 * </div>
 */
public class P45_WeeklySales {

    public static void main(String[] args) {
        Random random = new Random();
        
        int Day = 0;
        int total = 0;
        for (int i = 0; i < 7; i++) {
            int sale = random.nextInt(150) + 50;
                    Day = Day + 1;
                    System.out.println("Day " + Day + ": $" + sale);
                    total = total + sale;
        }
        System.out.println("Total sales this week(7 days): $" + total);

        // Write your program here
        // Hint: Generate random daily sales for each day of the week
        
    }

}
