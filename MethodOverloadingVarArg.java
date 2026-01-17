import java.util.Arrays;

public class MethodOverloadingVarArg {
    public static void main(String[] args) {
        fun(20,3,0,85,1,4,6,78);
        fun("Naghul Pranav","Narayani","rekha","Manohar");
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
