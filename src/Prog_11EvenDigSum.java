/**
 * java programme to do sum of even number
 */


import java.util.Scanner;

public class Prog_11EvenDigSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int evenDigitSum = getEvenDigitSum(number);

        if (evenDigitSum == -1) {
            System.out.println("Invalid input. The number is negative.");
        } else {
            System.out.println("Sum of even digits: " + evenDigitSum);
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers (invalid value)
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}