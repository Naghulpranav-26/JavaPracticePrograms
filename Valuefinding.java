import java.util.Scanner;

public class Valuefinding {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=123333445;
        int count=0;
        while(n>0){
            int m=n%10;
            if(m==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
