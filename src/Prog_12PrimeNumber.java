import java.util.Scanner;

public class Prog_12PrimeNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // 0 and 1 are not prime numbers
            }
            if (number <= 3) {
                return true; // 2 and 3 are prime numbers
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false; // Numbers divisible by 2 or 3 are not prime
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false; // Numbers divisible by i or i+2 are not prime
                }
            }
            return true;
        }
    }

