package main.java.prog1;

import java.util.Locale;
import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P44_CustomerArrival.png"/>
 * </div>
 */
public class P44_CustomerArrival {

    public static void main(String[] args) {
        Random random = new Random();
        
        int customer_time = 0;
        int customerN = 0;
                for (int i= 0; i < 5; i++) {
                   customerN = customerN + 1;
                    customer_time = customer_time + random.nextInt(9) + 1;
                    System.out.println ("Customer " + customerN + " arrived at minute: " + customer_time);
                }
                
                double averageWait = customer_time / 5.00;

        // Write your program here
        // Hint: Simulate customer arrivals with random times and track count

        // output
         System.out.printf(Locale.US, "Average waiting time: %.2f minutes\n", averageWait);
      
        
    }
}
