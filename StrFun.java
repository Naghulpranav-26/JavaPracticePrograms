import java.util.Scanner;

public class StrFun {
    public static void main(String[] args) {
        String message=greet();
        System.out.println(message);
    }
    static String greet(){
        Scanner sc=new Scanner(System.in);
        String msg=sc.next();
        return msg;
    }
}
