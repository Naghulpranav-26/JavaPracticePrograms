import java.util.Scanner;

public class Passing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        greet(name);
    }

   static void greet(String naam) {
       System.out.println(naam);

    }
}
