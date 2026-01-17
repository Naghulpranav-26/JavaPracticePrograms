import java.util.Scanner;

public class Salary {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Current Salary::");
        int salary=sc.nextInt();
        if(salary>25000){
            salary+=1000;
            System.out.println("The bonus="+salary);
        }
        else{
            salary+=2000;
            System.out.println("The bonus="+salary);
        }


    }
}
