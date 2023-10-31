/**
 * java programme for tringle "@"
 */


public class Prog_8nestedTriangle {

    public static void main(String[] args) {
        int n = 5; // Change n to control the height of the triangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

