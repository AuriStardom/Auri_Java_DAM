package main.java.prog1;

import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P43_LotterySimulator.png"/>
 * </div>
 */
public class P43_LotterySimulator {

    public static void main(String[] args) {
        Random random = new Random();
        
       
        System.out.print("Your numbers: ");
        for (int i = 0; i < 6; i++) {
            int lotN = random.nextInt (48) + 1;
            System.out.print(lotN + " ");
             
        }

        // Write your program here
        // Hint: Generate random lottery numbers and check if they match
        

    }
}
