import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000); // Step 1
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());

        // Step 2: Read date from server first (order matching server code)
        String serverDate = in.readUTF();

        // Step 3: Retrieve own IP address
        String myIP = InetAddress.getLocalHost().getHostAddress();

        // Step 4: Send IP address to server
        out.writeUTF(myIP);

        // Step 5: Display date & time sent by server
        System.out.println("Received date & time from server: " + serverDate);

        // Cleanup
        in.close();
        out.close(); // Step 6
        socket.close(); // Step 7
    }
}