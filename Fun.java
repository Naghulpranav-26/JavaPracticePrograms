import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num + num2;
        return sum;
    }
}

