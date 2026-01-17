import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Tcp1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client or server");
        String mode = sc.nextLine();
        if (mode.equals("server")) {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String msg = in.readLine();
                if (msg.equals("bye")) break;
                System.out.println("Client: " + msg);
                out.println(br.readLine());
            }
            s.close(); ss.close();
        } else {
            Socket s = new Socket("localhost", 5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                out.println(br.readLine());
                String msg = in.readLine();
                if (msg.equals("bye")) break;
                System.out.println("Server: " + msg);
            }
            s.close();
        }
    }
}