package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P44_CheckOrder.png">
 */
public class P44_CheckOrder {

    public static void main(String[] args) {
        // Write your program here
        // Hint: Read array and check if it's sorted in ascending order

        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int unordered = 0;

        System.out.println("Reading numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                result--;
                unordered++;
            }
            if (numbers[i] < numbers[i + 1]) {
                result++;
                unordered++;
            }
            if (numbers[i] == numbers[i + 1]) {
                result = result;
            }
        }
        if (result == 4) {
            System.out.println("Increasing sequence.");
        }
        else if (result == -4) {
            System.out.println("Decreasing sequence.");
        }
          else if (result == 0 && unordered > 0) {
            System.out.println("unordered sequence.");
        } 
        else if (result == 0) {
            System.out.println("All numbers are equal.");
        }
        else {
            System.out.println("Unordered sequence.");
        }

    }
}
