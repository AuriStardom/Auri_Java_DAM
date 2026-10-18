package main.java.prog1;
import java.util.Locale;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P34_PriceWithVAT.png"/>
 * </div>
 */
public class P34_PriceWithVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // dot as decimal separator
        
        
       double price_sans = scanner.nextDouble();
       double price_complete = ((price_sans/100)*21)+price_sans;
       System.out.printf(Locale.US, "Total price with VAT: %.2f",price_complete);
        
        
        
        // Write your program here
        // Hint: Calculate final price by adding VAT (21%) to the base price
        
        scanner.close();
    }
}
