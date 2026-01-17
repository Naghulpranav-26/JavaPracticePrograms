import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while (true) {
            char op = sc.next().trim().charAt(0);
            if(op=='+'|| op=='-'|| op=='*'|| op=='%'){
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                if (op == '+') {
                    ans=n1+n2;
                }
                if(op=='-'){
                    ans=n1-n2;
                }
                if (op == '*') {
                    ans=n1*n2;
                }
                if(op=='%'){
                    ans=n1%n2;
                }
                System.out.println(ans);
            }
            else{
                System.out.println("PLEASE ENTER THE VALID OPERATOR FOR PERFORMING OPERATION");
            }
        }
    }
}
