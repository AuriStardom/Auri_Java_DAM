package main.java.prog2;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P40_CounterWithE.png">
 */
public class P40_CounterWithE {

    public static void main(String[] args) {

        int digitone = 0;
        int digitcent = 0;
        int digitten = 0;
        int digitmil = 0;

        for (digitmil = 0; digitmil <= 9; digitmil++) {
            for (digitcent = 0; digitcent <= 9; digitcent++) {
            
            for (digitten = 0; digitten <= 9; digitten++) {
            
            for (digitone = 0; digitone <= 9; digitone++) {
                if (digitmil == 3) {
                    System.out.println("E" + digitcent + digitten + digitone);
                } else if (digitcent == 3) {
                    System.out.println("" + digitmil + "E" + digitten + digitone);
                } else if (digitten == 3) {
                    System.out.println("" + digitmil + digitcent + "E" + digitone);
                } else if (digitone == 3) {
                    System.out.println("" + digitmil + digitcent + digitten + "E");
                } else {
                    System.out.println("" + digitmil + digitcent + digitten + digitone);
                }

            }
        }
    }
}

// Write your program here
// Hint: Print numbers that contain the digit 'e' or match a pattern
}
}
