import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int P=in.nextInt();
        float T=in.nextFloat();
        int R=in.nextInt();
        float simpleinterest=(P*R*T)/100;
        System.out.println("The Simlpe Interest for the given values is:"+simpleinterest);
    }
}
