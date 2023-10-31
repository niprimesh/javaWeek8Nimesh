/**
 * First And Last Digit Sum
 */

public class Prog_7FirstLastSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        // Initialize variables to store the first and last digits
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number != 0) {
            if (number < 10) {
                firstDigit = number;
            }
            number /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // Output: 4
        System.out.println(sumFirstAndLastDigit(257)); // Output: 9
        System.out.println(sumFirstAndLastDigit(0));   // Output: 0
        System.out.println(sumFirstAndLastDigit(5));   // Output: 10
        System.out.println(sumFirstAndLastDigit(-10)); // Output: -1
    }
}

