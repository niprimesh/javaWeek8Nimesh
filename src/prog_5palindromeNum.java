/**
 * Palindrome Number
 */

public class prog_5palindromeNum {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // should return true
        System.out.println(isPalindrome(707));    // should return true
        System.out.println(isPalindrome(11212));  // should return false
    }

    public static boolean isPalindrome(int number) {
        // Handle negative numbers by converting them to positive
        if (number < 0) {
            number = Math.abs(number);
        }

        int originalNumber = number;
        int reverse = 0;

        // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        // Compare the original number with the reverse
        return originalNumber == reverse;
    }
}

