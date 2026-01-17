public class swaap {
    public static void main(String[] args) {
      int answ=nagh(23,32);
        System.out.println(answ);
    }
    static int nagh(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        return a;
    }
}
