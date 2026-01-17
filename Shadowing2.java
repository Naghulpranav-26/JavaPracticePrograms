public class Shadowing2 {
    static  int x=20;
    public static void main(String[] args) {
//        System.out.println(x);
            x=45;
        System.out.println(x);
    }
}
