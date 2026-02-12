import javax.swing.plaf.synth.SynthTextAreaUI;

public class Arr23 {
    public static  void main(String[]args){
        int[] arr = {10, 45, 23, 89, 34};
        int max = arr[0];
        int secondMax = arr[1];

         while (secondMax > max) {
            int temp = max;
            max = secondMax;
            secondMax = temp;

        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println("After the Iteration ");
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }

}
