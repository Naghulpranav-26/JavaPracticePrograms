import java.io.*;
import java.net.*;
import java.util.Scanner;
public class File {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client or server");
        String mode = sc.nextLine();
        if (mode.equals("server")) {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }
            out.println("EOF");
            br.close();
            s.close();
            ss.close();
            System.out.println("File sent successfully!");
        }
        else {
            Socket s = new Socket("localhost", 5000);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
            PrintWriter pw = new PrintWriter(
                    new FileWriter("received.txt"), true);

            String line;
            while ((line = in.readLine()) != null) {
                if (line.equals("EOF")) break;
                pw.println(line);
            }
            pw.close();
            in.close();
            s.close();
            System.out.println("File received successfully!");
        }
    }
}