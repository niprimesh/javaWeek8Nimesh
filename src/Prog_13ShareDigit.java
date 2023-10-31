public class Prog_13ShareDigit {

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));
            System.out.println(hasSharedDigit(9, 99));
            System.out.println(hasSharedDigit(15, 55));
            System.out.println(hasSharedDigit(12, 43));
        }
        public static boolean hasSharedDigit(int num1, int num2){
            if(!isValid(num1) || !isValid(num2)){
                return false;
            }
            int digit1Num1 = num1 % 10;
            int digit2Num1 = num1 / 10;
            int digit1Num2 = num2 % 10;
            int digit2Num2 = num2 / 10;

            return(digit1Num1 == digit1Num2 || digit1Num1 == digit2Num2 || digit2Num1 == digit1Num2 || digit2Num1 == digit2Num2);
        }
        public static boolean isValid(int number) {
            return (number >= 10 && number <= 99);
        }
    }

