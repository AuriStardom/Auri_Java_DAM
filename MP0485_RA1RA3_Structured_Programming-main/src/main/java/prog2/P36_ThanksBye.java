package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P36_ThanksBye.png">
 */
public class P36_ThanksBye {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int answer = 0;
        int looptimes = -1;
        double sumanswer = 1;
        int evensum = 0;
        int oddsum = -1;
        System.out.println("Give numbers:");
        for (int i=1; answer !=-1;) {
        answer = scanner.nextInt();
        if (answer %2 == 0) {
            evensum = evensum + 1;
        }
        else {
            oddsum = oddsum + 1;
        }
        looptimes++;
        sumanswer = sumanswer + answer;
        }
        
        double avg = sumanswer / looptimes;
                
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + (int) sumanswer);
        System.out.println("Numbers: " + looptimes);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evensum);
        System.out.println("Odd: " + oddsum);
        
        // Write your program here
        // Hint: Print a pattern using nested for loops
    }
}
