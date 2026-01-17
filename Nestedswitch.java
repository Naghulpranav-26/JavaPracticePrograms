import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int EmplId= input.nextInt();
        String Department=input.next();
        switch(EmplId){
            case 1:
                System.out.println("Naghul Pranav");
                break;
            case 2:
                System.out.println("Lava Kishore");
                break;
            case 3:
                switch (Department){
                    case "IT":
                        System.out.println("IT Department");
                    case "Bussiness":
                        System.out.println("Bussiness Guy");
                }
                break;
            default:
                System.out.println("Enter the valid input");
        }
    }
}
