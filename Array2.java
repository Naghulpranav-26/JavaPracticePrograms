import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int[]arr=new int[5];
        //array of primitivees
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= input.nextInt();
//            System.out.print(arr[i]+" ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//            for(int num:arr){
//                System.out.print(num+" ");
//            }
        //array of objects
        String [] str=new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));
        str[2]="Naghul";
        System.out.println(Arrays.toString(str));
        }
   }
