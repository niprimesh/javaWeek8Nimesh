/**
 * fibonacci number java PROGRAM
 */

public class Prog_9FibonacciNumber {

        public static void main(String[] args) {
            int n = 8; //Number of Fibonacci numbers to be printed

            int firstNumber = 1;
            int secondNumber = 1;

            System.out.println(firstNumber + " " + secondNumber + " ");

            for (int i = 3; i <= n; i++) {
                int nextNumber = firstNumber + secondNumber;
                System.out.println(nextNumber + " ");
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
    }

