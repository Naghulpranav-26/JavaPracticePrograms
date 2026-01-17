import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the celcius");
        float temp =input.nextFloat();
        float temp1=(temp*9/5)+32;
        System.out.println(temp1);
    }
}
