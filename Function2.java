import java.sql.SQLOutput;
import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        String msg=Greet();
        System.out.println("Your Name is:"+msg);
    }
    static  String Greet(){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        return name;
    }
}
