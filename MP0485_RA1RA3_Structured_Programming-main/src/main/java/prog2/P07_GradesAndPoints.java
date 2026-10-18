package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P07_GradesAndPoints.png">
 */
public class P07_GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        int points = scan.nextInt();
       
        System.out.print("Grade: ");
        if (points <0){
            System.out.println("impossible!");
        }
        if (points >=0 && points <=49){
            System.out.println("failed");
        }
        if (points >= 50 && points <= 59){
            System.out.println("1");
        }
        if (points >=60 && points <=69){
            System.out.println("2");
        }
        if (points >=70 && points <=79){
            System.out.println("3");
        }
        if (points >= 80 && points <=89){
            System.out.println("4");
        }
        if (points >= 90 && points <= 100){
            System.out.println("5");
        }
        if (points >100){
            System.out.println("incredible!");
        }
        
        
        
        
        
        // Write your program here
        // Hint: Convert grade to points (A=5, B=4, C=3, D=2, F=1) using if-else
    }
}
