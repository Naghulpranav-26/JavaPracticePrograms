import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        switch (fruit){
            case "Mango" -> System.out.println("The king of Fruit");
            case "Orange" -> System.out.println("Good for Skin");
            case "Grapes"-> System.out.println("Enhances body shine");
            case "Carrot" -> System.out.println("Good For Eyes");
            default -> System.out.println("Please enter the correct input");
        }
    }
}
