import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("King Of The Fruits");
                break;
            case "Orange":
                System.out.println("Good for Skin");
                break;
            case "Banana":
                System.out.println("Has potasium");
                break;
            case "Grapes":
                System.out.println("Used in wine");
                break;
            default:
                System.out.println("Please enter the valid fruit name");
        }
    }
}
