/**
 * input/read numbers with scanner output should be min and max numbers from input numbers
 */


import java.util.Scanner;

public class Prog2MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                min = Math.min(min, num);
                max = Math.max(max, num);
            } else {
                String input = scanner.next();
                if (input.equals("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit.");
                }
            }
        }

        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered.");
        } else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        scanner.close();
    }
}