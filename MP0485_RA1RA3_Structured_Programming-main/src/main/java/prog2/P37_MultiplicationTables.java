package main.java.prog2;

/**
 * <b>Content</b> flow control, for nested loops
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P37_MultiplicationTables.png">
 */
public class P37_MultiplicationTables {

    public static void main(String[] args) {
        final String LINES = "----------------------------";
        
        System.out.println("\n");
        for (int table = 1; table <= 10; table++) {
            
            System.out.println("Multiplication Table of " + table);
            System.out.println(LINES);
            for (int num = 1; num <=10; num++) {
                int result = table * num;
                System.out.println(table + " x " + num + " = " + result);
            }
        }
        
        
        
        
        
         // Write your program here
         // Hint: Use nested for loops to print multiplication table (1-10)
        
    }
}
