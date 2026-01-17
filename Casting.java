import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char cr=input.next().trim().charAt(0);
        if(cr>='a' && cr<='z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Upper Case");
        }
//        System.out.println(cr);
    }
}
