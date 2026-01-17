import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().trim().charAt(0);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        switch (op) {
            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1 - n2);
            case '*' -> System.out.println(n1 * n2);
            case '/' -> {
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("Cannot divide by Zero");
                }
            }
            case '%' -> {
                if (n2 != 0) {
                    System.out.println(n1 % n2);
                } else {
                    System.out.println("Cannot divide by Zero");
                }
            }
            default -> System.out.println("Invalid Operator");
        }
    }
}