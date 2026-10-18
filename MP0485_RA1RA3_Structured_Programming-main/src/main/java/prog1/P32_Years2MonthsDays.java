package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P32_Years2MonthsDays.png"/>
 * </div>
 */
public class P32_Years2MonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Years = scanner.nextInt();
        int months = Years *12;
        int Days = Years *360;
        System.out.println(Years + " years = " + months + " months = " + Days + " days");
        
        
        // Write your program here
        // Hint: Convert years to months and days, then calculate remaining days
        
        scanner.close();
    }
}
