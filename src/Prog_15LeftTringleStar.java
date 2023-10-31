/**
 * JAVA PROGRAM FOR TRINGLE STAR
 */

public class Prog_15LeftTringleStar {

    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the triangle's height

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // You can change the character to any symbol you want
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

