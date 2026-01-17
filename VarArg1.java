import java.util.Arrays;
public class VarArg1 {
    public static void main(String[] args) {
        change(1,2,3,1,87,5,55,156);
    }
    static void change(int ... v){
        System.out.println(Arrays.toString(v));
    }
}
