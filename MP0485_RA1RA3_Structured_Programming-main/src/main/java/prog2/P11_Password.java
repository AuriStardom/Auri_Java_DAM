package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, else command <hr/><br/>
 * <img src="../../../../javadoc/resources/P11_Password.png">
 */
public class P11_Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Password?");
        String pass = scan.nextLine();
        String pass_correct = "Caput Draconis";
       int result =  pass.compareTo(pass_correct);
        if (result == 0){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Off with you!");
        }
        
    

        // Write your program here
        // Hint: Compare entered password with the correct one
    }
}
