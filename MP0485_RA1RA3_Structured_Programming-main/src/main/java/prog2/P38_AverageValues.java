package main.java.prog2;
import java.util.Locale;
import java.util.Scanner;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P38_AverageValues.png">
 */
public class P38_AverageValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradesum = 0;
        for (int students = 1; students <= 3; students++) {
            gradesum = 0;
            for (int subjects = 1; subjects <= 4; subjects++) {
                System.out.println("Enter grade for Student " + students + ", Subject " + subjects);
                int grade = scanner.nextInt();
                gradesum += grade;
            }
            double result = gradesum / 4.0;
            System.out.printf(Locale.FRANCE, "Student %d average: %,2f\n\n", students, result);
        }

        // Write your program here
        // Hint: Use nested loops to read grades for each student/subject and calculate average
        // format output
        // System.out.printf("Student %d average: %.2f\n\n", student, average);
    }
}
