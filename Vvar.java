import java.util.*;
public class Vvar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc .nextLine().toLowerCase();
        int count=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch-'a' ==i){
                count++;
            }
        }
        System.out.print(count);
    }
}
