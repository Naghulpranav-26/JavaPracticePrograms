
public class Function {
    public static void main(String[] args) {
        String message=greet("Naghul Pranav");
        System.out.println(message);
    }
    static String greet(String name){
            String greeting="Hello " + name;
        return greeting;
    }
}
