package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> flow control, for loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P34_SumOfASequenceTheSequel.png">
 */
public class P34_SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("First number?");
        int firstnum = scanner.nextInt();
        System.out.println("Last number?");
        int lastnum = scanner.nextInt();
        
        int sumnum = 0;
        
        while (firstnum <= lastnum) {
            sumnum = sumnum + firstnum;
            firstnum++;
        }
        System.out.println("The sum is " + sumnum);

        // Write your program here
        // Hint: Sum numbers using formula or loop (more complex pattern)
    }
}
