package main.java.prog1;
import java.util.Scanner;

/**
 * <div class="block">
 *   <strong>Operators</strong><br/>
 *   Program to calculate data<br/>
 *   <img src="../../../../javadoc/resources/P36_IsDriver.png"/>
 * </div>
 */
public class P36_IsDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int age = scanner.nextInt();
        boolean driver = scanner.nextBoolean();
        
        
        System.out.println(age >= 18 && driver == true);
        
        
        // Write your program here
        // Hint: Check if age >= 18 to determine if eligible to drive

   scanner.close();
    }    
}
