//import java.util.Scanner;
//
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int a = 0;
//        int b = 1;
//        if (n >= 0) {
//            System.out.print(a+" ");
//        }
//        if (n >= 1) {
//            System.out.print(b+" ");
//        }
//        for (int i = 2; i < n; i++) {
//            int c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }
//    }
//}
// CHATGPT::
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        if (n >= 1) {
            System.out.println(a);
        }
        if (n >= 2) {
            System.out.println(b);
        }
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


//YOUTUBE:
//import java.util.Scanner;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while (count <= n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}