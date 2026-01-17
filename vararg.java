import java.util.Arrays;

public class vararg {
    public static void main(String[] args) {
        play("Naghul","Narayani","Mano","rekha","Indira kumar","ajith","Banumathy","janarthanan");
        play(1,2,3,45,56,67,89,90,122);
    }
    static void play(String...a){
        System.out.println(Arrays.toString(a));
    }
    static void play(int...a){
        System.out.println(Arrays.toString(a));
    }
}
