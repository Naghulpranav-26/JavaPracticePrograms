import java.util.Scanner;

public class Fun0 {
    public static void main(String[] args) {
        String greet=mygreet(" Naghul");
        System.out.println(greet);
    }

    static String mygreet(String name) {
        Scanner sc=new Scanner(System.in);
        String txt= sc.nextLine();
        String id=txt+name;
        return id;
    }
}
