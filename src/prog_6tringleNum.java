import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 */

public class prog_6tringleNum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}




