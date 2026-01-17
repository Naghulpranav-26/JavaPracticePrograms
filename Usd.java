import java.util.Scanner;

public class Usd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the indian rupees:");
        float rupees=s.nextFloat();
        float usd=rupees/80;
        System.out.println("The Value in US Dollar is:"+usd);

    }
}
