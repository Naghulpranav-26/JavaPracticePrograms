import java.util.Scanner;

public class Fiboo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Initial values
        int a = 0;
        int b = 1;

        // Standard checks for the first two numbers
        if (n == 0) {
            System.out.println(a);
            return; // Exit early
        }
        if (n == 1) {
            System.out.println(b);
            return; // Exit early
        }

        int c = 0;
        int i = 2; // Start counting from the 2nd index

        // The "Normal" while loop
        while (i <= n) {
            System.out.println(a);
            c = a + b;   // Calculate the next number
            a = b;       // Update 'a' to the next position
            b = c;       // Update 'b' to the latest sum
            i++;         // Increment the counter
        }


    }
}