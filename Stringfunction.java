import java.util.Scanner;

public class Stringfunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        String Personalized = Naghul(Name);
        System.out.println(Personalized);
    }
        static String Naghul(String Name){
            String message="Hello " + Name;
            return message;
        }
    }