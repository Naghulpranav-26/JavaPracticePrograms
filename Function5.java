import java.util.Arrays;

public class Function5 {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,4,6,7,88,99};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0]=21;
    }
}
