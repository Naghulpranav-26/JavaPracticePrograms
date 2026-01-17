public class MethodOverloading1 {
    public static void main(String[] args) {
       int msg= fun(2,3,4);
        System.out.println(msg);
    }
    static  int fun(int a,int b){
        return a+b;
    }
    static int fun(int a,int b,int c){
        return a+b+c;
    }
}
