import java.util.*;
public class Arr467
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int m=0;
        for (int i=0;i<arr.length;i++){
            m =m ^arr[i];
        }
        System.out.println(m);
    }


}
