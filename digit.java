import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println(0);
        }
//         num=0;
//        int rem=0;
        while(num<0){
             int rem=num%10;
            num=num/10;
//            System.out.println(rem);
        }
        System.out.println(num);
    }
}
