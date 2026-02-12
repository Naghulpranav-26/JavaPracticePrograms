import java.util.*;
public class Stringre{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int h=0;int e=0;
        for(String va1:s){
            int v=0;int c=0;
            for(char ch:va1.toCharArray()){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }
                else{
                    c++;
                }

            }
            if(v>=c){
                e++;
            }else{
                h++;
            }

        }
        int quotient = (5 * h) - (2 * e);
        System.out.print(quotient);
    }
}
