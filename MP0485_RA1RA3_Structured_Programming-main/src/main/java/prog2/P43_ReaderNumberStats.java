package main.java.prog2;

import java.util.Scanner;

/**
 * <b>Content</b> array, get and set values
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P43_ReaderNumberStats.png">
 */
public class P43_ReaderNumberStats {

    public static void main(String[] args) {
        double[] numbers = new double[5];
        Scanner scanner = new Scanner(System.in);
        int zerosum = 0;
        double positivesum = 0.0;
        double negativesum = 0.0;
        int countpositive = 0;
        int countnegative = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zerosum++;
            }
            if (numbers[i] > 0) {
                positivesum = positivesum + numbers[i];
                countpositive++;
            }
            if (numbers[i] < 0) {
                negativesum = negativesum + numbers[i];
                countnegative++;
            }
        }
        double resultpositive = positivesum / countpositive;
        double resultnegative = negativesum / countnegative;
        if (positivesum == 0) {
            System.out.println("Cannot calculate average of positive numbers");
            System.out.println("Average of negative numbers: " + resultnegative);
            System.out.println("Count of zeros: " + zerosum);
        } else if (negativesum == 0) {
            System.out.println("Average of positive numbers: " + resultpositive);
            System.out.println("Cannot calculate average of negative numbers");
            System.out.println("Count of zeros: " + zerosum);
        } else if (positivesum == 0 && negativesum == 0) {
            System.out.println("Cannot calculate average of positive numbers");
            System.out.println("Cannot calculate average of negative numbers");
            System.out.println("Count of zeros: " + zerosum);
        } else {
            System.out.println("Average of positive numbers: " + resultpositive);
            System.out.println("Average of negative numbers: " + resultnegative);
            System.out.println("Count of zeros: " + zerosum);
        }

        // Write your program here
        // Hint: Read array, find min, max, and calculate average
    }
}
