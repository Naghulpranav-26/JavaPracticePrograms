import java.util.Scanner;

public class CompareArr {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int leader=arr[n-1];
            for(int j=n-2;j>=0;j--) {
                if (arr[j] >leader) {
                    leader += arr[j];
                }
            }
        System.out.println(leader);
        }

    }
