import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("The greatest value is:"+a);
        }
        else{
            System.out.println("The greatest value is:"+b);
        }
    }
}
