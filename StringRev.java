import java.util.Scanner;

public class StringRev {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int  end=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                System.out.print(s.substring(i+1,end)+" ");
                end=i;
            }
            }
        System.out.print(s.substring(0,end));
        }
    }
    // other method
//    import java.util.*;
//public class Main{
//    public static void main(String[]args)
//    {
//        Scanner sc=new Scanner(System.in);
//        String[] s=sc.nextLine().split(" ");
//        // String n="";
//        for(int i=(s.length-1); i>=0 ; i--){
//            //   char v=s.charAt(i);
//            //    if(v==' ') {
//            System.out.print(s[i]+" ");
//            //      n="";
//            //    }else{
//            //      n+=v;
//        }
//        //   }
//        // System.out.print(n);
//
//
//    }
//}
