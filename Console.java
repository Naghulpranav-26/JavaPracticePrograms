import java.util.Scanner;

public class Console {
    public static void main(String[]args ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String username="naghul";
        String pas="abc";
        if(n>=1 &&n<=3) {
            if (n == 1) {
                String u = sc.next();
                String p = sc.next();
                if (u.equals(username) && p.equals(pas)) {
                    System.out.println("Sucessfull login!!!");
                } else {
                    System.out.println("Invalid Username or Password");
                }
            }
            if (n == 2) {
                System.out.println("Welcome to the registeration page::");
                System.out.print("Enter your name:");
                String name = sc.next();
                System.out.print("Enter your age:");
                int age = sc.nextInt();
                System.out.print("Enter your Department:");
                String dep = sc.next();
                System.out.println("Thank You For using this website!!!");
            }
            if (n == 3) {
                System.out.println("Exit");

            }
        }else{
            System.out.println("Enter the valid User Menu!!!");
        }
    }
}
