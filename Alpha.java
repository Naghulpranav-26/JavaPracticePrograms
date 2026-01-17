import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String  str=sc.nextLine();
//        System.out.println(str.trim().charAt(4));
        char ch=sc.next().trim().charAt(0);
        if(ch>'a' && ch<'z'){
            System.out.println("Small letter Alphabet");
        }
        else{
            System.out.println("Capital Letters");
        }
    }
}
