import java.util.*;
public class StringName{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        char m = 0;
        for(int i=0;i<n;i++){
            m=s.charAt(i);
            m++;

        }
        System.out.println(m);
    }
}
