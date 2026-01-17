public class Gem {
    public static void main(String[] args) {
        // Test 1: String Logic
        System.out.println("5" + 2 + 3);
        System.out.println(2 + 3 + "5");

        // Test 2: Byte Overflow
        byte b = 127;
        b++;
        System.out.println(b);
    }
}