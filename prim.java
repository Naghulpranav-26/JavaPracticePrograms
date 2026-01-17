import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean prime=isPrime(n);
        System.out.println(prime);
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0,1,negative are not prime
        for (int i = 2; i < n; i++) {  // check till n-1
            if (n % i == 0) {
                return false; // divisible → not prime
            }
        }
        return true; // no divisors → prime
    }
}
