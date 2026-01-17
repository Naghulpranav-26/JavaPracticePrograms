import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give the input for the Fibonacci series: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 0; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
